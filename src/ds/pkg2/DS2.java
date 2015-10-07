/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import ds.pkg2.Handler.KlasHandler;
import ds.pkg2.Handler.MainHandler;
import ds.pkg2.Handler.StudentHandler;
import java.util.ArrayList;
import java.util.Scanner;
import nl.hva.dmci.ict.inf.ads.lib.StdRandom;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class DS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //  Creating a scanner object
        Scanner input = new Scanner(System.in);

        //  Create Handlers
        KlasHandler klasHandler = new KlasHandler();
        StudentHandler studentHandler = new StudentHandler();
        MainHandler mainHandler = new MainHandler();
        

        System.out.print("How many students to create?: ");

        //TO-DO Check on legal input + exit option
        int amountOfStudents = input.nextInt();

        //  Create students
        studentHandler.createStudents(amountOfStudents);


//        try {
//            System.out.print("How many students to create?: ");
//
//        } catch (InputMismatchException exception) {
//            System.out.println("This is not an integer");
//
//        }

        System.out.println(amountOfStudents);

        //  Create students
        studentHandler.createStudents(amountOfStudents);
        

        //  Array with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();

        // Calculating the amount of classrooms to be created per course
        klasHandler.calculateClass(allStudents);

//        //  ArrayList of all classroomss
//        ArrayList<Klas> allClasses = klasHandler.getAllClasses();
//
//        //  ArrayList of classrooms filled with students
//        ArrayList<Klas> filled = mainHandler.studentInKlas(allStudents, allClasses);
        
//        // Convert allStudents ArrayList to an array to enable sorting
//        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
//
//        // Sort all the students based on "cijfer" from low to high
////        Selection.sort(allStudentsArray);
//        // Print all the contents of the allStudents array
//        for (Student allStudentsArray1 : allStudentsArray) {
//            System.out.println(allStudentsArray1.toString());
//        }
//
//        // Shuffle students array
//        StdRandom.shuffle(allStudentsArray);
//
//        Collections.sort(Arrays.asList(allStudentsArray), Student.StudentNummerComparator());
//
//        // Print all the contents of the allStudents array
//        System.out.println(filled.toString());

//        klasHandler.getAllClassesString();
//        studentHandler.getAllStudentsString();
        // Convert allStudents ArrayList to an array to enable sorting
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

        // Sort all the students based on "cijfer" from low to high
        // Insertion.sortNew( allStudentsArray, StudentNummerComparator());

        // Print all the contents of the allStudents array
//        for (Student allStudentsArray1 : allStudentsArray) {
//            System.out.println(allStudentsArray1.toString());
//        }

        // Print all the contents of the allStudents array

//        System.out.println("**SHUFFLE\n");
//        for (Student allStudentsArray1 : allStudentsArray) {
//            System.out.println(allStudentsArray1.toString());
//        }

        
        // Shuffle students array
        StdRandom.shuffle(allStudentsArray);

        //      Sort on studentnummer
        // Collections.sort(Arrays.asList(allStudentsArray), Student.StudentNummerComparator());
        Insertion.sortStudentNumber(allStudentsArray);
        
        System.out.println("----------------SORTED ON STUDENTNUMBER---------------");
        for (Student allStudentsArray1 : allStudentsArray) {
            System.out.println(allStudentsArray1.toString());
        }
        
        // Collections.sort(Arrays.asList(allStudentsArray), Student.CijferComparator());
        Insertion.sortCijfer(allStudentsArray);
        
        System.out.println("********SORTED ON CIJFER********");
        for (Student allStudentsArray1 : allStudentsArray) {
            System.out.println(allStudentsArray1.toString());
        }
        
        
        // Bucket sort
//        int maxVal = 5;
//        Student[] data = {};
//
//        System.out.println("Before: " + Arrays.toString(data));
//        BucketSort.sort(data, maxVal);
//        System.out.println("After:  " + Arrays.toString(data));
    }
}

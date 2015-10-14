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
import java.util.Arrays;
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

        int amountOfStudents = input.nextInt();

        //  Create students
        studentHandler.createStudents(amountOfStudents);

        // Get array with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();

        // Calculate and create the amount of classes to be created per course
        klasHandler.calculateClass(allStudents);

        //  Get ArrayList with all generated and empty classes
        ArrayList<Klas> allClasses = klasHandler.getAllClasses();

//        System.out.println(allClasses.toString());
//        System.out.println(allStudents.toString());
        
        // Convert allStudents ArrayList to an array to enable sorting
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);

        // Shuffle students array
        StdRandom.shuffle(allStudentsArray);

        // Fill classes with students and 
        // get ArrayList of classrooms filled with students
        Klas[] filled = mainHandler.studentInKlas(allStudentsArray, allClasses);
        
        // Shuffle all the classes and return as an array
        Klas[] shuffledClasses = filled;
        StdRandom.shuffle( shuffledClasses );
        
//        // Sort all Students in all classes based on studentnumber
//        // Collections.sort(Arrays.asList(allStudentsArray), Student.StudentNummerComparator());
//        // Loop through all classes
//        for (Klas k : filled) {
//
//            // Loop through all students per class
//            for (Student s : (Student[]) k.getStudents().toArray()) {
//                
//            }
//
//        }

        // Sort all classes alphabetically
        // Insertion.sortKlassenAlphabetic(shuffledClasses);
        Arrays.sort(shuffledClasses, new KlasNameComparator());
        
        
        // Print all classes
        for (Klas k : filled) {
            System.out.println(k.toString());
        }
        
        //      Sort on studentnummer
        // Collections.sort(Arrays.asList(allStudentsArray), Student.StudentNummerComparator());
        // Insertion.sortStudentNumber(allStudentsArray);

//        System.out.println("----------------SORTED ON STUDENTNUMBER---------------");
//        for (Student allStudentsArray1 : allStudentsArray) {
//            System.out.println(allStudentsArray1.toString());
//        }
//        
//        // Collections.sort(Arrays.asList(allStudentsArray), Student.CijferComparator());
//        Insertion.sortCijfer(allStudentsArray);
//        
//        System.out.println("----------------SORTED ON CIJFER----------------");
//        for (Student s : allStudentsArray) {
//            System.out.println(s.toString());
//        }
    }
}

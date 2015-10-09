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

        int amountOfStudents = input.nextInt();

        //  Create students
        studentHandler.createStudents(amountOfStudents);

        //  Array with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();

        // Calculating the amount of classrooms to be created per course
        klasHandler.calculateClass(allStudents);

        //  ArrayList of all classrooms
        ArrayList<Klas> allClasses = klasHandler.getAllClasses();

//        System.out.println(allClasses.toString());
//        System.out.println(allStudents.toString());
        
        //  ArrayList of classrooms filled with students
        mainHandler.studentInKlas(allStudents, allClasses);
        ArrayList<Klas> filled = mainHandler.getFilled();
        
        System.out.println(filled.get(1).toString());

        
        // Convert allStudents ArrayList to an array to enable sorting
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        
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
        
        System.out.println("----------------SORTED ON CIJFER----------------");
        for (Student s : allStudentsArray) {
            System.out.println(s.toString());
        }
    }
}

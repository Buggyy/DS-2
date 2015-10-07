/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;
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

        //  Create new KlasHandler & StudentHandler
        KlasHandler klasHandler = new KlasHandler();
        StudentHandler studentHandler = new StudentHandler();
        MainHandler mainHandler = new MainHandler();

        //  Create students
        studentHandler.createStudents(13);
        //  Retrieve array with students
        //  At this point we only got an array with studentnumbers and grades
        ArrayList<Student> allStudents = studentHandler.getStudents();
        
        

        // Calculating the amount of classrooms to be created.
        klasHandler.calculateClass(allStudents);
       
         
        //  ArrayList of all classroomss
        ArrayList<Klas> allClasses = klasHandler.getAllClasses();
                
        //  ArrayList of classrooms filled with students
        ArrayList<Klas> filled = mainHandler.studentInKlas(allStudents, allClasses);
        
        System.out.println(filled.toString());
        
//        klasHandler.getAllClassesString();
//        studentHandler.getAllStudentsString();
        
        // allStudents ArrayList omzetten naar array
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        
        Selection.sort(allStudentsArray);
        
        for (Student allStudentsArray1 : allStudentsArray) {
            System.out.println(allStudentsArray1.toString());
        }
        
        // shuffle students array
        StdRandom.shuffle(allStudentsArray);

        System.out.println("SHUFFLE");
        for (Student allStudentsArray1 : allStudentsArray) {
            System.out.println(allStudentsArray1.toString());

        }
        
        // Bucket sort
        int maxVal=5;
      Student [] data= {}; 
 
      System.out.println("Before: " + Arrays.toString(data));
      BucketSort.sort(data, maxVal);
      System.out.println("After:  " + Arrays.toString(data));
        
    }
}

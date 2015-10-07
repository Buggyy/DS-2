/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
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


        //  Create students
        studentHandler.createStudents(10);
        //  Retrieve array with students
        //  At this point we only got an array with studentnumbers
        ArrayList<Student> allStudents = studentHandler.getStudents();


        // 
        klasHandler.calculateClass(allStudents);


        klasHandler.getAllClassesString();
        studentHandler.getAllStudents();



        System.out.println(klasHandler.getAllClassesString());
        
        // allStudents ArrayList omzetten naar array
        Student[] allStudentsArray = allStudents.toArray(new Student[allStudents.size()]);
        
        Selection.sort(allStudentsArray);
        
        for( int i = 0; i < allStudentsArray.length; i++){
            System.out.println( allStudentsArray[i].toString() );
        }
        
        // shuffle students array
        StdRandom.shuffle(allStudentsArray);
        System.out.println("Geshuffled vanaf hier -------------\n");
        for( int i = 0; i < allStudentsArray.length; i++){
            System.out.println( allStudentsArray[i].toString() );
        }
        
        // Bucket sort
        int maxVal=5;
      Student [] data= {}; 
 
      System.out.println("Before: " + Arrays.toString(data));
      BucketSort.sort(data, maxVal);
      System.out.println("After:  " + Arrays.toString(data));
        
    }
}

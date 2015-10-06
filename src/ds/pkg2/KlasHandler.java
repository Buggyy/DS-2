/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import static java.lang.Math.round;
import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 *
 */
public class KlasHandler {

    private final int MAX_STUDENTS = 32;

    private int amountOfClassesInt;

    private ArrayList<Klas> allClasses = new ArrayList<>();

    @Override
    public String toString() {
        return allClasses + " ";
    }

    public void getAllClasses() {
 
           System.out.println(allClasses.toString());

    }


    /**
     * Calculating the amount of classrooms to be created.
     *
     * @param arr ArrayList of students
     */
    public void calculateClass(ArrayList<Student> arr) {
        //  Comments @attributes in this method are examples
        //  10.000
        int amountOfStudents = arr.size();
        //  5
        int amountOfCourses = course.values().length;
        //  2000
        int studentsPerCourse = amountOfStudents / amountOfCourses;
        //  62.5
        double amountOfClasses = studentsPerCourse / MAX_STUDENTS;
        //  63
        int amountOfClassesInt = (int) round(amountOfClasses) + 1;

        //  Generate the amount of classes
        generateClass(amountOfClassesInt);

    }
    
 
    /**
     * 
     * @param classes 
     */
    public void generateClass(int classes) {

        for (int i = 1; i <= classes; i++) {
            for (course value : course.values()) {
                allClasses.add(new Klas(value.toString(), i));
            }
        }
    }
    
    /**
     * -------------------------------------------------------------------------------
     * Give student a class
     * @param studArr
     * @param klasArr 
     */
    public void studentInKlas(ArrayList<Student> studArr, 
            ArrayList<Klas> klasArr) {
        
        for (int i = 0; i < klasArr.size(); i++) {
            studArr.get(i).setKlas(klasArr.get(i));
            
        }
        
    }
// -----------------------------------------------------------------------------------
    /**
     * 
     */
    public enum course {

        /**
         *
         */
        B,
        /**
         *
         */
        G,
        /**
         *
         */
        N,
        /**
         *
         */
        S,
        /**
         *
         */
        T
    }
}

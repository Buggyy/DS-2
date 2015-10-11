/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2.Handler;

import static ds.pkg2.Handler.KlasHandler.course.values;
import ds.pkg2.Klas;
import ds.pkg2.Student;
import static java.lang.Math.ceil;
import java.util.ArrayList;


public class KlasHandler {

    private static final int MAX_STUDENTS = 32;

    private int amountOfClassesInt;

    private final ArrayList<Klas> allClasses = new ArrayList<>();

    public ArrayList<Klas> getAllClasses() {
        return allClasses;
    }

    /**
     * Calculating the amount of classrooms to be created.
     *
     * @param arr ArrayList of students
     */
    public void calculateClass(ArrayList<Student> arr) {
        //  10.000
        int amountOfStudents = arr.size();
        //  5
        int amountOfCourses = values().length;
        //  2000
        double studentsPerCourse = amountOfStudents / amountOfCourses;

        //  62.5
        double amountOfClasses = studentsPerCourse / MAX_STUDENTS;
        //  63
        int amountOfClassesInt = (int) ceil(amountOfClasses);

        //  Generate the amount of classes
        generateClass(amountOfClassesInt);

    }
     

    /**
     * Generate the amount of classrooms
     *
     * @param classes
     */
    public void generateClass(int classes) {

        for (int i = 0; i < classes; i++) {
            for (course value : values()) {
                allClasses.add(new Klas(value.toString(), i));
            }
        }
    }


    @Override
    public String toString() {
        return allClasses + " ";
    }

    /**
     * Returns all classes as a String
     */
    public void getAllClassesString() {
    }

    /**
     * Course
     */
    public enum course {

        /**
         * Business IT and Management
         */
        B, /**
         * Game Development
         */
        G, /**
         * System and Network Engineering
         */
        N, /**
         * Software Engineering
         */
        S, /**
         * Technische Informatica
         */
        T
    }
}

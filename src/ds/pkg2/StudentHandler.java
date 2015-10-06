/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class StudentHandler {

    private ArrayList<Student> allStudents = new ArrayList<>();

    private final int BASE_NUMBER = 50060001;

    /**
     *
     * @return
     */
    public ArrayList getStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        return allStudents + " ";
    }

    public void getAllStudents() {

        System.out.println(allStudents.toString());

    }

    // Generates a studentnumber for the given index
    /**
     *
     * @param number
     * @return
     */
    public int generateStudentNumber(int number) {
        return BASE_NUMBER + number;
    }

    /**
     *
     * @param amount
     */
    public void createStudents(int amount) {
        for (int i = 0; i < amount; i++) {
            Student student = new Student(generateStudentNumber(i));
            allStudents.add(student);
        }
    }

}

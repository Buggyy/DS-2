/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Stefan Lobato [IS204] 500707274
 */
public class Handler {

    private ArrayList<Student> allStudents = new ArrayList<>();

    
    // input amount of students
    // Create student (constructor)
        // Create studentnumber (method)
            // forloop x amount of students
            // 50060001 + i = studentnumber
    
        // Create grade (method)
            // Generated.
    
        //  Create course
            //  amount of students / courses = amount of students per course
            //  amount of students per course / 32 = round()
    
   

    public void createStudents(int amount){
        for(int i = 0; i < amount; i++){
            Student student = new Student(generateStudentNumber(i + 1));
            allStudents.add(student);
        }
    }
    
    public ArrayList getStudents(){
        return allStudents;
    }
    
    public void generateClass() {
        // Generate class from regexr.

        //  
    }

    public void addStudent(Student student) {
//        if (list.size() < MAX_STUDENTS) {
//            list.add(student);
//
//        } else {
//            //  generate new klas (use generate class method)
//
//            throw new IndexOutOfBoundsException();
//        }

    }

    public void updateClass() {
        // 
    }

    // Generates a studentnumber for the given index
    public int generateStudentNumber(int number) {
        final int BASE_NUMBER = 50060000;

        return BASE_NUMBER + number;
    }

    public static double generateCijfer() {
        DecimalFormat df = new DecimalFormat("#.#");

        double rangeMin = 1.0;
        double rangeMax = 10.0;

        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        return randomValue = Double.valueOf(df.format(randomValue));

    }
}

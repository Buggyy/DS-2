/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Stefan Lobato [IS204] 500707274
 */
public class KlasHandler {

    private ArrayList<Student> allStudents = new ArrayList<>();
    private final int MAX_STUDENTS = 32;

    private int amountOfClassesInt;
    
    private ArrayList<Klas> allClasses = new ArrayList<>();
    
    public enum course {

        B, G, N, S, T
    }

    public void createStudents(int amount) {
        for (int i = 0; i < amount; i++) {
            Student student = new Student(generateStudentNumber(i + 1));
            allStudents.add(student);
        }
    }

    public ArrayList getStudents() {
        return allStudents;
    }

    public ArrayList calculateClass(ArrayList<Student> arr) {
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
        amountOfClassesInt = (int) Math.round(amountOfClasses);

        for (int i = 0; i < amountOfCourses; i++) {
            generateClass(amountOfClassesInt);
        }

        return null;

    }

    public ArrayList generateClass(int classes) {
        
        course[] allCourses = course.values();    // Create list for all courses

        // allClasses = new ArrayList();   // Create list for all classes
        
        // Loops through all courses
        for(course c : course.values()){    // Iterate through courses
            
            // Loop untill the right amount of classes had been made for each course
            for(int i = 0; i < classes; i++){   
                allClasses.add( new Klas("B", i + 1) );   // TO DO: Richting met enum aangeven
                allClasses.add( new Klas("G", i + 1) );   // Proberen te loopen door alle richtingen in plaats van zelf in te voeren
                allClasses.add( new Klas("N", i + 1) );
                allClasses.add( new Klas("S", i + 1) );
                allClasses.add( new Klas("T", i + 1) );
            }
            
        }

        //   Regular expression
        //   I[B, G, N, S or T]2[0-9]{4}

        //  return arraylist of all classes like:
        //  [0] IS20001
        //  [1] IS20002
        //  [2] IS20003
        //  [4] IS20004
        //  ..
        //  [42] IB20028
        //  [43] IB20029
        //  etc.
        return null;
    }
    
    public void printAllClasses(){
        for(Klas k : allClasses){
            System.out.println( k.toString() );
        }
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

    // Generates a studentnumber for the given index
    public int generateStudentNumber(int number) {
        final int BASE_NUMBER = 50060000;

        return BASE_NUMBER + number;
    }
}

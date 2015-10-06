/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import static ds.pkg2.KlasHandler.course.values;
import static java.lang.Math.round;
import static java.lang.System.out;
import java.util.ArrayList;


public class KlasHandler {

    private final int MAX_STUDENTS = 32;

    private int amountOfClassesInt;
    
    private final ArrayList<Klas> allClasses = new ArrayList<>();
  

   
    /**
     * 
     * @param arr 
     */
    public void calculateClass(ArrayList<Student> arr) {
        //  Comments @attributes in this method are examples
        //  10.000
        int amountOfStudents = arr.size();
        //  5
        int amountOfCourses = values().length;
        //  2000
        int studentsPerCourse = amountOfStudents / amountOfCourses;

        //  62.5
        double amountOfClasses = studentsPerCourse / MAX_STUDENTS;

        //  63
        amountOfClassesInt = (int) round(amountOfClasses);

        for (int i = 0; i < amountOfCourses; i++) {
            generateClass(amountOfClassesInt);
        }

    }

    public ArrayList generateClass(int classes) {
        
        course[] allCourses = values();    // Create list for all courses

        // allClasses = new ArrayList();   // Create list for all classes
        
        // Loops through all courses
        for(course c : values()){ 
            
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
        //   I[BGNST]2[0-9]{4}

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
        allClasses.stream().forEach((k) -> {
            out.println(k.toString());
        });
    }



 

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

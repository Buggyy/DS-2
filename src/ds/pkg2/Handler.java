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
public class Handler {
    
    private ArrayList<Student> allStudents = new ArrayList<>();

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
    
      
      /**
       * Calculation i.e:
       * 10.000 students / 5 courses = 2000 students per course
       * 2000 / 32 = 62.5 round() = 63 classes
       * 
       * 
       * 
       */

      // Generates a studentnumber for the given index
      public int generateStudentNumber(int number){
          final int BASE_NUMBER = 50060000;
          
          return BASE_NUMBER + number;
      }
}

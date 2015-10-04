/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Omer
 */
public class Klas {
    
    // Attributes
    private ArrayList<Student> list = new ArrayList<>();
    private String naam;
    
    private final int MAX_STUDENTS = 32;
    
    // Constructor
    public Klas(){
        
    }
    
    public void addStudent(Student student){
        if(list.size() >= MAX_STUDENTS){   // Throw exception if Klas already has 32 students
            throw new IndexOutOfBoundsException();
        }
        if(list.size() < MAX_STUDENTS)
        list.add(student);
    }
    
    public ArrayList getList(){
        return this.list;
    }
    
    public String getNaam(){
        return this.naam;
    }
    
}

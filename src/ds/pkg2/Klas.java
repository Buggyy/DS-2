/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import static java.lang.String.format;
import java.util.LinkedList;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Klas implements Comparable<Klas>{

    // Attributes
    private LinkedList students = new LinkedList();

    private String naam;
    private String richting;
    private int nummer;

    /**
     *
     * @param richting
     * @param nummer
     */
    public Klas(String richting, int nummer) {
        this.naam = "I" + richting + "2" + format("%04d", nummer);
        this.students = students;
    }

    public String getNaam() {
        return naam;
    }

    /**
     * Adds a Student to the Klas
     * @param student
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }


    
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(this.naam).append("\n").toString();
//        for (Student student : students) {
//            sb.append(student.toString()).append("\n");
//        }
//
//        return sb.toString();
//
//    }

//    public int compareName(Klas that){
//        if (this.getNaam() > that.getNaam() ) {
//            return -1;
//        }
//        if (this.cijfer < that.cijfer) {
//            return +1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Klas naam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2.Comparator;

import ds.pkg2.Student;
import java.util.Comparator;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class CijferComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if ( s1.getCijfer() > s2.getCijfer() ) {
            return -1;
        }
        if ( s1.getCijfer() < s2.getCijfer() ) {
            return +1;
        } else {
            return 0;
        }
    }
    
}

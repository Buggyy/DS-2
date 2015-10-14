package ds.pkg2;

import static java.lang.String.format;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Klas<Item> {


    // Attributes
    private LinkedList<Student> students = new LinkedList<>();

    private final String naam;

    /**
     * Constructor
     */
    public Klas(String richting, int nummer) {
        this.naam = "I" + richting + "2" + format("%04d", nummer + 1);
        // this.students = students;
    }

    public LinkedList getStudents(){
        return this.students;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("\n***Klas: ").append(this.naam);
        
        for (Object student : students) {
            sb.append(student);
        }
        return sb.toString();
    }

    public String getNaam() {
        return naam;
    }

//    public void addStudent(Student student) {
//        if(student)
//        
//        this.students.add(student);
//        
//    }
    
    /**
     * Adds a Student to the Klas. Inserts the student at the right position
     * @param s 
     */
    public void addStudent(Student s) {

        if (students.size() == 0) {
            students.add(s);
        } else if (students.get(0).getStudentNummer() > s.getStudentNummer()) {
            students.add(0, s);
        } else if (students.get(students.size() - 1).getStudentNummer() < s.getStudentNummer()) {
            students.add(students.size(), s);
        } else {
            int i = 0;
            while (students.get(i).getStudentNummer() < s.getStudentNummer()) {
                i++;
            }
            students.add(i, s);
        }

    }
    
//    static Comparator<Klas> KlasNameComparator() {
//        return new Comparator<Klas>() {
//
//            @Override
//            public int compare(Klas k1, Klas k2) {
//                if ( k1.getNaam().compareTo( k2.getNaam() ) == -1) {
//                    return -1;
//                }
//                if ( k1.getNaam().compareTo( k2.getNaam() ) == 1 ) {
//                    return +1;
//                } else {
//                    return 0;
//                }
//            }
//
//        };
//    }

    
}

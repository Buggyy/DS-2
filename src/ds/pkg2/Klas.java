package ds.pkg2;

import static java.lang.String.format;
import java.util.LinkedList;


public class Klas /*implements Comparator<Klas> */ {


    // Attributes
    private LinkedList students = new LinkedList();

    private final String naam;

    /**
     *
     * @param richting
     * @param nummer
     */
    public Klas(String richting, int nummer) {
        this.naam = "I" + richting + "2" + format("%04d", nummer + 1);
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Klas: ").append(this.naam).append("\n");
        for (Object student : students) {
            sb.append(student);
        }
        return sb.toString();
    }

    public String getNaam() {
        return naam;
    }

    /**
     * Adds a Student to the Klas
     *
     * @param student
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }
    
//    @Override
//    public int compare(Klas o1, Klas o2) {
//        ;
//    }
//    
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

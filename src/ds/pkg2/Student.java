/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import static java.lang.Double.valueOf;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Student /*implements Comparator<Student>*/ {
    
    // Attributes
    private int studentNummer = 0;
//    private Klas klas = new Klas(null, studentNummer);
    private double cijfer = 0;

    public Student(int studentNummer) {
        this.studentNummer = studentNummer;
        // this.klas = klas;
        this.cijfer = generateCijfer();
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

//    public Klas getKlas() {
//        return klas;
//    }
//
//    public void setKlas(Klas klas) {
//        this.klas = klas;
//    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
    
    /**
     * Generates a random double within the range 1.0 - 10.0
     *
     * @return
     */
    public static double generateCijfer() {
        DecimalFormat df = new DecimalFormat("#.#");

        double rangeMin = 1.0;
        double rangeMax = 10.0;

        Random r = new Random();

        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue = valueOf(df.format(randomValue));
    }

    /**
     * Returns a String representation of a Student object
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nStudentnummer: ").append(this.studentNummer).append("\n");
//        sb.append("Klas: ").append(this.klas).append("\n");
        sb.append("Cijfer: ").append(this.cijfer).append("\n");

        return sb.toString();
    }

//    /**
//     * Compares the cijfer attribute of two Student objects with each other
//     *
//     * @return
//     */
//    @Override
//    public int compare(Student o1, Student o2) {
//        if (o1.cijfer > o2.getCijfer()) {
//            return -1;
//        }
//        if (o1.cijfer < o2.getCijfer()) {
//            return +1;
//        } else {
//            return 0;
//        }
//    }
//
//    static Comparator<Student> CijferComparator() {
//        return new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.getCijfer() > s2.getCijfer()) {
//                    return -1;
//                }
//                if (s1.getCijfer() < s2.getCijfer()) {
//                    return +1;
//                } else {
//                    return 0;
//                }
//            }
//
//        };
//    }
//
//    static Comparator<Student> StudentNummerComparator() {
//        return new Comparator<Student>() {
//
//            @Override
//            public int compare(Student s1, Student s2) {
//                if ( s1.getStudentNummer() < s2.getStudentNummer() ) {
//                    return -1;
//                }
//                if ( s1.getStudentNummer() > s2.getStudentNummer() ) {
//                    return +1;
//                } else {
//                    return 0;
//                }
//            }
//
//        };
//    }
}

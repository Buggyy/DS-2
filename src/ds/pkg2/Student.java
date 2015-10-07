/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Student implements Comparator<Student> {

    // Attributes
    private int studentNummer;
    private Klas klas;
    private double cijfer;

    public Student(int studentNummer) {
        this.studentNummer = studentNummer;
        this.klas = klas;
        this.cijfer = generateCijfer();
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

        return randomValue = Double.valueOf(df.format(randomValue));

    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public Klas getKlas() {
        return klas;
    }

    public void setKlas(Klas klas) {
        this.klas = klas;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    /**
     * Returns a String representation of a Student object
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Studentnummer: " + this.studentNummer + "\n");
        sb.append("Klas: " + this.klas + "\n");
        sb.append("Cijfer: " + this.cijfer + "\n");

        return sb.toString();
    }

    /**
     * Compares the cijfer attribute of two Student objects with each other
     *
     * @return
     */
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.cijfer > o2.getCijfer()) {
            return -1;
        }
        if (o1.cijfer < o2.getCijfer()) {
            return +1;
        } else {
            return 0;
        }
    }

    static Comparator<Student> CijferComparator() {
        return new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCijfer() > s2.getCijfer()) {
                    return -1;
                }
                if (s1.getCijfer() < s2.getCijfer()) {
                    return +1;
                } else {
                    return 0;
                }
            }

        };
    }

    static Comparator<Student> StudentNummerComparator() {
        return new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                if ( s1.getStudentNummer() > s2.getStudentNummer() ) {
                    return -1;
                }
                if ( s1.getStudentNummer() < s2.getStudentNummer() ) {
                    return +1;
                } else {
                    return 0;
                }
            }

        };
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Student implements Comparable {

    // Attributes
    private int studentNummer;
    private Klas klas;
    private double cijfer;

    public Student(int studentNummer, Klas klas) {
        this.studentNummer = studentNummer;
        this.klas = klas;
        this.cijfer = generateCijfer();
    }

    public Student(int studentNummer) {
        this.studentNummer = studentNummer;
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
        sb.append("Cijfer: " + this.cijfer + "\n\n");

        return sb.toString();
    }

    /**
     * Compares the cijfer attribute of two Student objects with each other
     * 
     * @param that
     * @return
     */
    public int compareTo(Student that) {
        if (this.cijfer > that.cijfer) {
            return +1;
        }
        if (this.cijfer < that.cijfer) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

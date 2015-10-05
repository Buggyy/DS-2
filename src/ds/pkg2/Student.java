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
 * @author Omer Z 500.. & Stefan Lobato [IS204] 500707274
 */
public class Student{

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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("Studentnummer: " + this.studentNummer + "\n");
        sb.append("Klas: " + this.klas + "\n");
        sb.append("Cijfer: " + this.cijfer + "\n\n");
        
        return sb.toString();
    }

}

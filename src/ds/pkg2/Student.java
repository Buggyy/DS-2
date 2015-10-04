/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

/**
 *
 * @author Omer
 */
public class Student {

    // Attributes
    private int studentNummer;
    private Klas klas;
    private double cijfer;

    public Student(int studentNummer, Klas klas, double cijfer) {
        this.studentNummer = studentNummer;
        this.klas = klas;
        this.cijfer = cijfer;
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

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import static java.lang.String.format;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Klas {

    // Attributes
    private ArrayList<Student> klas = new ArrayList<>();
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
    }

    /**
     * Adds a Student to the Klas
     * @param student
     */
    public void addStudent(Student student) {
        this.klas.add(student);
    }

    /**
     *
     * @return
     */
    public String getRichting() {
        return richting;
    }

    /**
     *
     * @param richting
     */
    public void setRichting(String richting) {
        this.richting = richting;
    }

    /**
     *
     * @return
     */
    public int getNummer() {
        return nummer;
    }

    /**
     *
     * @param nummer
     */
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public ArrayList<Student> getKlas() {
        return this.klas;
    }

    /**
     *
     * @return
     */
    public String getNaam() {
        return this.naam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return sb.append(this.naam).append("\n").toString();

    }

    private static final Logger LOG = Logger.getLogger(Klas.class.getName());

}

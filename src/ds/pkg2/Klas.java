/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Omer
 */
public class Klas {

    // Attributes
    private ArrayList<Student> list = new ArrayList<>();
    private String naam;

    private final int MAX_STUDENTS = 32;

    // Constructor
    public Klas() {

    }

    public enum course {
        B, G, N, S, T
    }

    public ArrayList getList() {
        return this.list;
    }

    public String getNaam() {
        return this.naam;
    }

}

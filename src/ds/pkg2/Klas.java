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
    private String richting;
    private int nummer;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Naam: " + this.naam + "\n");
        sb.append("Richting: " + this.richting + "\n");
        sb.append("Nummer: " + this.nummer + "\n\n");
        
        return sb.toString();
    }

    // Constructor
    public Klas() {

    }

    public Klas(String richting, int nummer) {
        this.naam = "I" + richting + "2" + String.format("%04d", nummer);
    }
    
    public void addStudent(Student student){
        this.list.add( student );
    }

    public String getRichting() {
        return richting;
    }

    public void setRichting(String richting) {
        this.richting = richting;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public ArrayList getList() {
        return this.list;
    }

    public String getNaam() {
        return this.naam;
    }

}

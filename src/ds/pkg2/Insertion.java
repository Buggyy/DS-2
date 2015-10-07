/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.Comparator;
import nl.hva.dmci.ict.inf.ads.lib.In;
import nl.hva.dmci.ict.inf.ads.lib.StdOut;

/**
 *
 * @author Omer
 */
public class Insertion {

    public static void sort(Comparable[] a) {  // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void sortCijfer(Student[] studenten) {

        double beginTime = System.nanoTime();
        
        for (int i = 1; i < studenten.length; i++) {
 
            Student temp = studenten[i];
            int j = i;
 
            while (j > 0 && studenten[j - 1].getCijfer() < temp.getCijfer()) {
 
                studenten[j] = studenten[j - 1];
 
                j--;
            }
 
            studenten[j] = temp;
 
        }

        double endTime = System.nanoTime();
        
        System.out.println("Cijfer sortering - benodigd tijd: " + (endTime - beginTime) / 1000000000 + " sec") ;
    }
    
    public static void sortStudentNumber(Student[] studenten) {

        double beginTime = System.nanoTime();
        
        for (int i = 1; i < studenten.length; i++) {
 
            Student temp = studenten[i];
            int j = i;
 
            while (j > 0 && studenten[j - 1].getStudentNummer() > temp.getStudentNummer()) {
 
                studenten[j] = studenten[j - 1];
 
                j--;
            }
 
            studenten[j] = temp;
 
        }
        
        double endTime = System.nanoTime();

        System.out.println("Studentnummer sortering - benodigd tijd: " + (endTime - beginTime) / 1000000000 + " sec");
        
    }
    
    public static void sortKlassenAlphabetic(Klas[] klassen) {

        double beginTime = System.nanoTime();
        
        for (int i = 1; i < klassen.length; i++) {
 
            Klas temp = klassen[i];
            int j = i;
 
            while (j > 0 && ( klassen[j - 1].getNaam().compareTo( temp.getNaam() ) == 1 ) ){
 
                klassen[j] = klassen[j - 1];
 
                j--;
            }
 
            klassen[j] = temp;
 
        }
        
        double endTime = System.nanoTime();

        System.out.println("Studentnummer sortering - benodigd tijd: " + (endTime - beginTime) / 1000000000 + " sec");
        
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {  // Print the array, on a single line.
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {  // Read strings from standard input, sort them, and print.
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}

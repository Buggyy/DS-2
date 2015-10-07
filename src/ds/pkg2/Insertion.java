package ds.pkg2;

import static java.lang.System.nanoTime;
import static java.lang.System.out;
import java.util.logging.Logger;
import nl.hva.dmci.ict.inf.ads.lib.In;
import static nl.hva.dmci.ict.inf.ads.lib.In.readStrings;
import nl.hva.dmci.ict.inf.ads.lib.StdOut;
import static nl.hva.dmci.ict.inf.ads.lib.StdOut.print;
import static nl.hva.dmci.ict.inf.ads.lib.StdOut.println;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class Insertion {

    /**
     *
     * @param a
     */
    public static void sort(Comparable[] a) {  // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++) {  // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    /**
     *
     * @param studenten
     */
    public static void sortCijfer(Student[] studenten) {

        double beginTime = nanoTime();
        
        for (int i = 1; i < studenten.length; i++) {
 
            Student temp = studenten[i];
            int j = i;
 
            while (j > 0 && studenten[j - 1].getCijfer() < temp.getCijfer()) {
 
                studenten[j] = studenten[j - 1];
 
                j--;
            }
 
            studenten[j] = temp;
 
        }

        double endTime = nanoTime();
        
    }
    
    /**
     *
     * @param studenten
     */
    public static void sortStudentNumber(Student[] studenten) {

        double beginTime = nanoTime();
        
        for (int i = 1; i < studenten.length; i++) {
 
            Student temp = studenten[i];
            int j = i;
 
            while (j > 0 && studenten[j - 1].getStudentNummer() > temp.getStudentNummer()) {
 
                studenten[j] = studenten[j - 1];
 
                j--;
            }
 
            studenten[j] = temp;
 
        }
        
        double endTime = nanoTime();

        
    }
    
    /**
     *
     * @param klassen
     */
    public static void sortKlassenAlphabetic(Klas[] klassen) {

        double beginTime = nanoTime();
        
        for (int i = 1; i < klassen.length; i++) {
 
            Klas temp = klassen[i];
            int j = i;
 
            while (j > 0 && ( klassen[j - 1].getNaam().compareTo( temp.getNaam() ) == 1 ) ){
 
                klassen[j] = klassen[j - 1];
 
                j--;
            }
 
            klassen[j] = temp;
 
        }
        
        double endTime = nanoTime();

        
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
        for (Comparable a1 : a) {
            print(a1 + " ");
        }
        println();
    }

    /**
     *
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {  // Read strings from standard input, sort them, and print.
        String[] a = readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
    private static final Logger LOG = Logger.getLogger(Insertion.class.getName());

}

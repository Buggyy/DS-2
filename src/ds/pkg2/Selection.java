/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2;

import java.util.Comparator;

/**
 *
 * @author Omer
 */
public class Selection implements Comparator<Student> {
    
    /**
     * Sort a[] into increasing order.
     * 
     * @param a 
     */
    public static void sort(Student[] a) {  
        int N = a.length;               // array length
        for (int i = 0; i < N; i++) {  // Exchange a[i] with smallest entry in a[i+1...N).
            int min = i;                 // index of minimal entr.
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static boolean less(Student v, Student w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Student[] a) {  // Print the array, on a single line.
        for (Comparable a1 : a) {
            System.out.print(a1 + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Student[] a) {  // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.compareTo( s2 );
    }
    
}

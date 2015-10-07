// file:    bucketsort.java
// author:  Robert Keller
// purpose: illustrating a very fast sorting program for natural numbers in
//          a reasonably small range only
//
//          bucketsort works as follows: The minimum and maximum of the 
//          range of numbers is found.  Then an array of "buckets" is 
//          allocated for each integral value between the minimum and
//          maximum inclusive.  The number of each value in the original
//          array is counted by one pass over the latter, using the datum
//          as an index into the bucket array.
//
//          This method is O(N) where N is the number of elements to be sorted;
//          a prime example of the use of the linear-addressing principle.
//
//          If the range of numbers is to large, the bucket array can't be
//          allocated and the method will fail.

public class BucketSort {

//    public static void sort(Student[] a, int maxVal) {
//        Student[] bucket = new Student[maxVal + 1];
//
//        for (int i = 0; i < bucket.length; i++) {
//            bucket[i] = ;
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            bucket[a[i]]++;
//        }
//
//        int outPos = 0;
//        for (int i = 0; i < bucket.length; i++) {
//            for (int j = 0; j < bucket[i]; j++) {
//                a[outPos++] = i;
//            }
//        }
//    }

}

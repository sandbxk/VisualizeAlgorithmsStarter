package visualizealgorithms.bll.algorithm.sorting;

//Project imports

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

import java.util.Random;

/**
 * @author Jeppe Moritz Led
 */
public class BruteSort extends GenericAlgorithm {

    /**
     * Constructor that calls super class with basic info
     */
    public BruteSort() {
        /*  The probability of the original input list being in the exact order it’s in is 1 to n! (faculty)
        *
        * Time Complexities:
        * constant - array indexing, hashmap etc.
        * logN (log) - Binary Search, trees
        * N (linear) - Linear Search
        * N log N (linear log) - QuickSort, MergeSort, TimSort (though linear in best-case for TimSort)
        * N^2 (poly) - BubbleSort, SelectionSort, InsertionSort
        * 2^N (exp) - Tower of Hanoi (not sorting algo though...)
        * N! (faculty) - BruteSort
        *
        * So for each switch (s) there is a new 1 of (n!) probability that it has ben magically sorted
        *
        * Just for n!:
        * 1:1
        * 2:2
        * 3:6  = 1*2*3 =
        * 4:24 = 1*2*3*4 =
        * 5:120
        * 6:720
        * 7:5040
        * 8:40320
        * 9:362880
        * 10:3628800
        * 11:39916800
        * 12:479001600
        * etc.
        *
        * However with each try, the chance stays the same, however with the number of trys
        * the chances overall increases
        * */

        super("Brute Sort", "Random O(?) \"sort of\" sorting algorithm", AlgorithmType.SORTING
        );
    }

    /**
     * The actual algorithm implementation
     */
    @Override
    public void doWork() {
        Comparable[] arr = (Comparable[]) super.getData();

        Random r = new Random();
        while(!isSorted(arr)) {
            // Get two random indices
            int i1 = r.nextInt(arr.length);
            int i2 = r.nextInt(arr.length);

            // Swap values on random indices
            Comparable temp = arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=temp;
        }
    }


    /**
     *
     * @param arr
     * @return
     */
    private boolean isSorted(Comparable[] arr){
        Comparable temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(temp.compareTo(arr[i])<1)
                temp=arr[i];
            else
                return false;
        }
        return true;
    }
}

package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class TimSort extends GenericAlgorithm {

    final int MIN_MERGE = 32;

    /**
     *
     */
    public TimSort() {
        super("TimSort", "O(n log n) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        Comparable[] arr = (Comparable[]) super.getData();

        Arrays.sort(arr);    //actually optimized QuickSort (dual pivots)....
                             //TimSort is for Comparables<T> + InsertionSort / MergeSort

        // 1,4,10,3,7,4332,2,23,2,3,4,5,80
    }
}




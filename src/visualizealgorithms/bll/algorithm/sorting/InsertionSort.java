package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class InsertionSort extends GenericAlgorithm {


    /**
     *
     */
    public InsertionSort() {
        super("InsertionSort", "O(N^2) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        Comparable[] arr = (Comparable[]) super.getData();

        int n = arr.length;
        for (int i = 1; i < n; ++i) { //O(n^2)
            Comparable key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && (arr[j].compareTo(key) > 0)) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}




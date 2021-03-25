package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class MergeSort extends GenericAlgorithm {

    /**
     *
     */
    public MergeSort() {
        super("MergeSort", "Fast O(n log n) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        int[] intArray = (int[]) super.getData();

        mergeSort(intArray, intArray.length - 1);
    }

    /**
     *
     * @param a
     * @param n
     */
    private void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }


    /**
     *
     * @param a
     * @param l
     * @param r
     * @param left
     * @param right
     */
    public void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }




}




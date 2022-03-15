package visualizealgorithms.bll.algorithm;

public class InsertionSort extends GenericAlgorithm{


    public InsertionSort() {
        super("Insertion Sort", "Sorting algorithm , kinda slow", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        int[] arr = (int[]) super.getData();

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

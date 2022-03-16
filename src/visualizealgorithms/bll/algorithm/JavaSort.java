package visualizealgorithms.bll.algorithm;

import java.util.Arrays;

public class JavaSort extends GenericAlgorithm {


    public JavaSort() {
        super("Java Sort", "Arrays.stream.sorted - Internal sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] data = (int[]) super.getData();
        Arrays.stream(data).sorted().toArray();

    }
}

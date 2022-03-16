package visualizealgorithms.bll.algorithm;

import java.util.Arrays;

public class JavaSort2 extends GenericAlgorithm {


    public JavaSort2() {
        super("Java Sort", "Arrays.Sort - Internal sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] data = (int[]) super.getData();
        //Arrays.stream(data).sorted().toArray();
        Arrays.sort(data);
    }
}

package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.*;

//Java imports
import javax.swing.*;
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;";

        //Add implemented/selected algorithms here..
        algorithms.add(new InsertionSort());
        algorithms.add(new QuickSort());
        algorithms.add(new MergeSort());
        algorithms.add(new JavaSort());
        algorithms.add(new JavaSort2());
        algorithms.add(new LinearSearch());

        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}

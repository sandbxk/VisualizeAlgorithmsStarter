package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.misc.TowerOfHanoi;
import visualizealgorithms.bll.algorithm.sorting.*;


//Java imports
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
        //Simple sorting algorihms
        algorithms.add(new BubbleSort());
        //algorithms.add(new SelectionSort()); //FIXME: not prepared for Comparable
        algorithms.add(new InsertionSort());
        algorithms.add(new BruteSort());

        //Advanced sorting algorithms
        algorithms.add(new QuickSort());
        //algorithms.add(new MergeSort()); //FIXME: not prepared for Comparable
        algorithms.add(new TimSort());

        //Misc algorithms
        algorithms.add(new TowerOfHanoi());

        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}

package visualizealgorithms.bll.algorithm;

public class LinearSearch extends GenericAlgorithm {


    public LinearSearch() {
        super("Linear Search", "Shit O(n) search algo", AlgorithmType.SEARCHING);
    }

    @Override
    public void doWork() {
        int[] data = (int[]) super.getData();

        int wanted = data[data.length-1];

        for (int element : data){
            if (element == wanted)
                break;
        }


    }
}

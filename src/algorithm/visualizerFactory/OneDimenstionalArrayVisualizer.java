package algorithm.visualizerFactory;

public class OneDimenstionalArrayVisualizer implements Visualizer{

    int[] nums;

    public OneDimenstionalArrayVisualizer(int[] nums){
        this.nums = nums;
    }

    @Override
    public void visualize() {
        for(Integer i : this.nums){
            System.out.println(i + ", ");
        }
        System.out.println();   //next line
    }
}

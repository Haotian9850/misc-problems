package algorithm.visualizerFactory;

import java.util.List;

public class OneDimensionalListVisualizer implements Visualizer {

    List<Integer> list;

    public OneDimensionalListVisualizer(List<Integer> list){
        this.list = list;
    }


    @Override
    public void visualize() {
        for(Integer i : this.list){
            System.out.print(i + ", ");
        }
        System.out.println();   //next line
    }
}

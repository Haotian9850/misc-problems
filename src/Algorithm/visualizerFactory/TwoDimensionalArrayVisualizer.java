package Algorithm.visualizerFactory;

public class TwoDimensionalArrayVisualizer implements Visualizer{

    public int[][] grid;

    public TwoDimensionalArrayVisualizer(){
        //default constructor
    }

    public TwoDimensionalArrayVisualizer(int[][] grid){
        this.grid = grid;
    }

    @Override
    public void visualize() {
        for(int[] row : this.grid){
            for(int i = 0; i < this.grid[0].length - 1; ++ i){
                System.out.print(row[i] + ", ");
            }
            System.out.print(row[row.length - 1]);
            System.out.println();   //new line separator
        }
    }

}

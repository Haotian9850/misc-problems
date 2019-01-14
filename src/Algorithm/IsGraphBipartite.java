package Algorithm;

import java.util.Arrays;
import java.util.LinkedList;

public class IsGraphBipartite {

    //accepts adjacency list input
    public boolean isBipartite(int[][] graph){
        //coloring approach
        int[] colors = new int[graph.length];
        Arrays.fill(colors, 0); //init, 0: uncolored
        for(int i = 0; i < graph.length; ++ i){
            if(colors[i] != 0){
                continue;
            }
            colors[i] = 1;
            LinkedList<Integer> queue = new LinkedList<>();
            queue.offer(i);
            while(!queue.isEmpty()){
                int node = queue.remove();
                for(Integer a : graph[node]){
                    if(colors[a] == 0){
                        colors[a] = -1 * colors[a];
                        queue.push(a);
                    }else{
                        if(colors[a] == colors[node]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

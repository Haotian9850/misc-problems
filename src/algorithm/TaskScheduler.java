package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {

    /*n: between two same tasks, there must be n different tasks / just idle*/

    public static int leastInterval(char[] tasks, int n){
        //PQ impl
        int result = 0;
        int[] freq = new int[26];
        PriorityQueue<Integer> heap = new PriorityQueue<>(26, Collections.reverseOrder());
        for(Character c : tasks){
            ++ freq[c - 'A'];
        }
        for(Integer i : freq){
            if(i > 0){  //important!
                heap.add(i);
            }
        }
        while(!heap.isEmpty()){
            int cnt = 0;
            List<Integer> pending = new ArrayList<>();
            //fill the gap
            while(cnt <= n){
                if(!heap.isEmpty()){
                    if(heap.peek() > 1){
                        pending.add(heap.poll() - 1);
                    }else{
                        heap.poll();
                    }
                }
                ++ result;
                if(heap.isEmpty() && pending.isEmpty()){
                    break;
                }
                ++ cnt;
            }
            for(Integer i : pending){
                heap.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        char[] testArray = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(testArray, 2));
    }
}

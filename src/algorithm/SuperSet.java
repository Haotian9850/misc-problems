package algorithm;

import javax.swing.plaf.SeparatorUI;
import java.util.*;

public class SuperSet {

    public List<Integer> array;
    public HashMap<Integer, Integer> map;

    public SuperSet(){
        this.array = new ArrayList<>();
        this.map = new HashMap<>();
    }

    public void insert(int n){
        this.array.add(n);
        this.map.put(n, this.array.size() - 1);
    }

    public void remove(int n){
        int index = this.map.get(n);
        swap(this.array.size() - 1, index);
        this.array.remove(this.array.size() - 1);
    }

    private void swap(int i, int j){
        int temp = this.array.get(i);
        this.array.set(i, this.array.get(j));
        this.array.set(j, temp);
    }

    public int getRandom(){
        Random rand = new Random();
        int randIndex = rand.nextInt((this.array.size() - 1) - 0 + 1) + 0;
        return this.array.get(randIndex);
    }
}

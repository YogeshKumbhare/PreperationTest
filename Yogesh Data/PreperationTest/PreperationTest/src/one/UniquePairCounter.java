package one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UniquePairCounter extends PairCounter {

    int [] inputearray = new int[50];
    public UniquePairCounter(int[] input) {
        this.inputearray = input;
    }

    int countPairs(){
        List list = new ArrayList();

        HashSet<Integer> set = new HashSet();

        for(int i=0;i<inputearray.length;i++){

            set.add(inputearray[i]);
        }
        int count = 0;

        for( int j : set){

            if(j > 0 && set.contains(j*(-1))){
                count++;
            }

        }

        return count;
    }
}

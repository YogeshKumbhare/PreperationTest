package one;

public class Luxsoft {
    public static void main(String[] args) {


        //Welcome to this interview!
        //Please write program which will give possibility to find number of unique pairs in array of random integers.
        //Unique pair is two opposite numbers, like [-2,2], [-6,6] etc. In other words - two numbers with the same
        //absolute value but different sign.

        //Example input:
        int[] input = new int[]{7, -5, 6, 5, -8, 5, -5, 1, 7, -6, -1, -2, 1 , -1}; //We have two unique pairs in this array: [-5,5] and [-1,1]

        PairCounter pairCounter = new UniquePairCounter(input);


        //Expected result:
        //2
        System.out.println(pairCounter.countPairs());
    }

}


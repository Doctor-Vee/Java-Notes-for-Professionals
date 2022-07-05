package hackerrank_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgrammingContest {

    public static void main(String[] args) {
        List<Integer> ratings = new ArrayList<>();
        System.out.println(minimizeBias(ratings));

    }

    public static int minimizeBias(List<Integer> ratings) {
        // Write your code here
        int minimumTotalBias = 0;
        Collections.sort(ratings);
        for(int i = 0; i < ratings.size() - 1; i+=2){
            minimumTotalBias += ratings.get(i+1) - ratings.get(i);
        }
        return minimumTotalBias;
    }
}

package com.tsystems.javaschool.tasks.subsequence;
import java.util.*;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        try {
            boolean result = true;

            List xx = new ArrayList(x);
            List yy = new ArrayList(y);
            List newList = new ArrayList<>();
            int firstIncl = 0;
            int indexOfEqual = 0;
                for (int i = 0; i < 1; i++){
                    for (int j = 0; j < yy.size(); j++){
                        if (xx.get(i) == yy.get(j)){
                            firstIncl = j;
                        }

                    }
                }

            for (int i = 0; i < xx.size(); i++){
                for (int j = 0; j < yy.size(); j++){
                    if (xx.get(i) == yy.get(j)){
                        if (j >= firstIncl){
                            newList.add(yy.get(j));
                        }
                    }
                }
            }

                Set<String> set = new HashSet<>(newList);
                newList.clear();
                newList.addAll(set);

            if (newList.size() == xx.size()){
                for (int i = 0; i < newList.size(); i++){
                    if (xx.get(i) == newList.get(i)){
                        indexOfEqual++;
                    }
                }
                if (indexOfEqual == xx.size()){
                    result = true;
                }
            } else result = false;

            return result;
        } catch (NullPointerException e){
            throw new IllegalArgumentException();
        } catch (IndexOutOfBoundsException e){
            return true;
        }

    }
}

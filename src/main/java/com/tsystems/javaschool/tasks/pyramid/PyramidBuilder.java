package com.tsystems.javaschool.tasks.pyramid;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        List<Integer> input= new ArrayList<>(inputNumbers);
        Collections.sort(input);
        int[][] result = new int[0][0];
        if (input.size() == 3){
            result = threePyramid(input);
        }


        return result;
    }

    public int[][] threePyramid (List<Integer> l){
        for (int i = 0; i <= 4; i = i + 2){
            l.add(i, 0);
        }
        List<Integer> firstRow = l.subList(0, 3);
        List<Integer> secondRow = l.subList(3, 6);
        int [][] pyramid = new int[2][3];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 3; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 3; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        return pyramid;
    }

    public int[][] sixPyramid (List<Integer> l){
        for (int i = 0; i <= 4; i = i + 2){
            l.add(i, 0);
        }
        List<Integer> firstRow = l.subList(0, 3);
        List<Integer> secondRow = l.subList(3, 6);
        int [][] pyramid = new int[2][3];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 3; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 3; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        return pyramid;
    }


}

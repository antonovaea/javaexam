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
        } else if (input.size() == 6){
            result = sixPyramid(input);
        } else if (input.size() == 10){
            result = tenPyramid(input);
        } else if (input.size() == 15){
            result = fifteenthPyramid(input);
        } else if (input.size() == 21){
            result = twentyOnePyramid(input);
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
        for (int i = 0; i <= 10; i = i + 2){
            l.add(i, 0);
        }
        l.add(0, 0);
        l.add(3,0);
        l.add(4,0);
        List<Integer> firstRow = l.subList(0, 5);
        List<Integer> secondRow = l.subList(5, 10);
        List<Integer> thirdRow = l.subList(10, 15);
        int [][] pyramid = new int[3][5];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 5; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 5; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        for (int i = 2; i < 3; i++){
            for (int j = 0; j < 5; j++){
                pyramid[i][j] = thirdRow.get(j);
            }
        }
        return pyramid;
    }

    public int[][] tenPyramid (List<Integer> l){
        for (int i = 0; i <= 19; i = i + 2){
            l.add(i, 0);
        }
        l.add(0,0);
        l.add(1,0);
        l.add(4,0);
        l.add(5, 0);
        l.add(6, 0);
        l.add(7, 0);
        l.add(12, 0);
        l.add(13, 0);
        List<Integer> firstRow = l.subList(0, 7);
        List<Integer> secondRow = l.subList(7, 14);
        List<Integer> thirdRow = l.subList(14, 21);
        List<Integer> fourthRow = l.subList(21, 28);
        int [][] pyramid = new int[4][7];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 7; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 7; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        for (int i = 2; i < 3; i++){
            for (int j = 0; j < 7; j++){
                pyramid[i][j] = thirdRow.get(j);
            }
        }
        for (int i = 3; i < 4; i++){
            for (int j = 0; j < 7; j++){
                pyramid[i][j] = fourthRow.get(j);
            }
        }
        return pyramid;
    }
    public int[][] fifteenthPyramid (List<Integer> l){
        for (int i = 0; i <= 28; i = i + 2){
            l.add(i, 0);
        }
        l.add(0,0);
        l.add(1,0);
        l.add(2, 0);
        l.add(5, 0);
        l.add(7, 0);
        l.add(8, 0);
        l.add(8, 0);
        l.add(9, 0);
        l.add(10, 0);
        l.add(16, 0);
        l.add(17, 0);
        l.add(18, 0);
        l.add(19,0);
        l.add(25, 0);
        l.add(26,0);

        System.out.println(l);
        List<Integer> firstRow = l.subList(0, 9);
        List<Integer> secondRow = l.subList(9, 18);
        List<Integer> thirdRow = l.subList(18, 27);
        List<Integer> fourthRow = l.subList(27, 36);
        List<Integer> fifthRow = l.subList(36, 45);
        System.out.println(firstRow);
        System.out.println(secondRow);
        System.out.println(thirdRow);
        System.out.println(fourthRow);
        System.out.println(fifthRow);
        int [][] pyramid = new int[5][9];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 9; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 9; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        for (int i = 2; i < 3; i++){
            for (int j = 0; j < 9; j++){
                pyramid[i][j] = thirdRow.get(j);
            }
        }
        for (int i = 3; i < 4; i++){
            for (int j = 0; j < 9; j++){
                pyramid[i][j] = fourthRow.get(j);
            }
        }
        for (int i = 4; i < 5; i++){
            for (int j = 0; j < 9; j++){
                pyramid[i][j] = fifthRow.get(j);
            }
        }
        return pyramid;
    }

    public int[][] twentyOnePyramid (List<Integer> l){
        for (int i = 0; i <= 40; i = i + 2){
            l.add(i, 0);
        }
        l.add(0, 0);
        l.add(1, 0);
        l.add(2, 0);
        l.add(3, 0);
        l.add(6, 0);
        l.add(7, 0);
        l.add(8,0);
        l.add(9,0);
        l.add(10, 0);
        l.add(11,0);
        l.add(12,0);
        l.add(13,0);
        l.add(18, 0);
        l.add(19,0);
        l.add(20,0);
        l.add(20,0);
        l.add(21,0);
        l.add(22,0);
        l.add(30,0);
        l.add(31, 0);
        l.add(32,0);
        l.add(33,0);
        l.add(42,0);
        l.add(43, 0);

        List<Integer> firstRow = l.subList(0, 11);
        List<Integer> secondRow = l.subList(11, 22);
        List<Integer> thirdRow = l.subList(22, 33);
        List<Integer> fourthRow = l.subList(33, 44);
        List<Integer> fifthRow = l.subList(44, 55);
        List<Integer> sixthRow = l.subList(55, 66);
        int [][] pyramid = new int[6][11];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = firstRow.get(j);
            }
        }
        for (int i = 1; i < 2; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = secondRow.get(j);
            }
        }
        for (int i = 2; i < 3; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = thirdRow.get(j);
            }
        }
        for (int i = 3; i < 4; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = fourthRow.get(j);
            }
        }
        for (int i = 4; i < 5; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = fifthRow.get(j);
            }
        }
        for (int i = 5; i < 6; i++){
            for (int j = 0; j < 11; j++){
                pyramid[i][j] = sixthRow.get(j);
            }
        }
        return pyramid;
    }


}

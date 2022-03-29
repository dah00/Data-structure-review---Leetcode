package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        // Checking by column
        for(int i=0; i<9; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);
                }
            }
        }
        // checking by row
        for(int j=0; j<9; j++){
            Set<Character> set = new HashSet<>();
            for(int i=0; i<9; i++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]))
                        return false;
                    else
                        set.add(board[j][i]);
                }
            }
        }
        // checking by box | for the first 3 rows
        int indexC = 0;
        while(indexC!=9){
            Set<Character> set = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=indexC; j<indexC+3; j++){
                    if(board[j][i] != '.'){
                        if(set.contains(board[j][i]))
                            return false;
                        else
                            set.add(board[j][i]);
                    }
                }
            }
            indexC += 3;
        }

        // checking by box | for the second 3 rows
        indexC = 0;
        while(indexC!=9){
            Set<Character> set = new HashSet<>();
            for(int i=3; i<6; i++){
                for(int j=indexC; j<indexC+3; j++){
                    if(board[j][i] != '.'){
                        if(set.contains(board[j][i]))
                            return false;
                        else
                            set.add(board[j][i]);
                    }
                }
            }
            indexC += 3;
        }

        // checking by box | for the third 3 rows
        indexC = 0;
        while(indexC!=9){
            Set<Character> set = new HashSet<>();
            for(int i=6; i<9; i++){
                for(int j=indexC; j<indexC+3; j++){
                    if(board[j][i] != '.'){
                        if(set.contains(board[j][i]))
                            return false;
                        else
                            set.add(board[j][i]);
                    }
                }
            }
            indexC += 3;
        }

        return true;
    }
}

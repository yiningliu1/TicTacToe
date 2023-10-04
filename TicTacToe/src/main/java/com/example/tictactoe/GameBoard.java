package com.example.tictactoe;

import java.util.Arrays;

public class GameBoard {
    public static Integer[][] board = new Integer[3][3];
    public static Boolean isOnePlayer;
    public static int player;
    private static int randomCounter = 0;
    public static void reset(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = 0;
            }
        }
        randomCounter = 0;
    }
    public static void place(int x, int y){
        if(board[x][y] == 0) {
            board[x][y] = player;
            if(player == 1){
                player = 2;
            }
            else{
                player = 1;
            }
        }
    }

    public static void randomMove(){
        int x = (int)(Math.random() * 3);
        int y = (int)(Math.random() * 3);
        if(board[x][y] == 0){
            place(x, y);
            randomCounter++;
        }
        else if(randomCounter < 4){
            randomMove();
        }
    }
    public static int checkWinner(){
        int count = 0;
        for(int i = 0; i < 3; i++){
            if(board[i][0] == 1 && board[i][1] == 1 && board[i][2] == 1){
                return 1;
            }
            else if(board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1){
                return 1;
            }
            else if(board[i][0] == 2 && board[i][1] == 2 && board[i][2] == 2){
                return 2;
            }
            else if(board[0][i] == 2 && board[1][i] == 2 && board[2][i] == 2){
                return 2;
            }
            else if(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
                return 2;
            }
            else if(board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2){
                return 2;
            }
            else if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
                return 1;
            }
            else if(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1){
                return 1;
            }
            if(!(Arrays.asList(board[i]).contains(0))){
                count++;
            }
        }
        if(count == 3){
            return 4;
        }
        return 0;
    }
}

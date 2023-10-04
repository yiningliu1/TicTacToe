package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.tictactoe.GameBoard.isOnePlayer;

public class GameController {

    @FXML
    private Circle O1;

    @FXML
    private Circle O2;

    @FXML
    private Circle O3;

    @FXML
    private Circle O4;

    @FXML
    private Circle O5;

    @FXML
    private Circle O6;

    @FXML
    private Circle O7;

    @FXML
    private Circle O8;

    @FXML
    private Circle O9;

    @FXML
    private Text X1;

    @FXML
    private Text X2;

    @FXML
    private Text X3;

    @FXML
    private Text X4;

    @FXML
    private Text X5;

    @FXML
    private Text X6;

    @FXML
    private Text X7;

    @FXML
    private Text X8;

    @FXML
    private Text X9;

    @FXML
    private Button btn_1;

    @FXML
    private Button btn_2;

    @FXML
    private Button btn_3;

    @FXML
    private Button btn_4;

    @FXML
    private Button btn_5;

    @FXML
    private Button btn_6;

    @FXML
    private Button btn_7;

    @FXML
    private Button btn_8;

    @FXML
    private Button btn_9;

    @FXML
    private Button btn_return;

    @FXML
    private Text txt_turn;

    @FXML
    private Text txt_winner;

    private void check(){
        if(GameBoard.board[0][0] == 1){
            btn_1.setDisable(true);
            X1.setVisible(true);
        }
        else if(GameBoard.board[0][0] == 2){
            btn_1.setDisable(true);
            O1.setVisible(true);
        }
        if(GameBoard.board[0][1] == 1){
            btn_2.setDisable(true);
            X2.setVisible(true);
        }
        else if(GameBoard.board[0][1] == 2){
            btn_2.setDisable(true);
            O2.setVisible(true);
        }
        if(GameBoard.board[0][2] == 1){
            btn_3.setDisable(true);
            X3.setVisible(true);
        }
        else if(GameBoard.board[0][2] == 2){
            btn_3.setDisable(true);
            O3.setVisible(true);
        }
        if(GameBoard.board[1][0] == 1){
            btn_4.setDisable(true);
            X4.setVisible(true);
        }
        else if(GameBoard.board[1][0] == 2){
            btn_4.setDisable(true);
            O4.setVisible(true);
        }
        if(GameBoard.board[1][1] == 1){
            btn_5.setDisable(true);
            X5.setVisible(true);
        }
        else if(GameBoard.board[1][1] == 2){
            btn_5.setDisable(true);
            O5.setVisible(true);
        }
        if(GameBoard.board[1][2] == 1){
            btn_6.setDisable(true);
            X6.setVisible(true);
        }
        else if(GameBoard.board[1][2] == 2){
            btn_6.setDisable(true);
            O6.setVisible(true);
        }
        if(GameBoard.board[2][0] == 1){
            btn_7.setDisable(true);
            X7.setVisible(true);
        }
        else if(GameBoard.board[2][0] == 2){
            btn_7.setDisable(true);
            O7.setVisible(true);
        }
        if(GameBoard.board[2][1] == 1){
            btn_8.setDisable(true);
            X8.setVisible(true);
        }
        else if(GameBoard.board[2][1] == 2){
            btn_8.setDisable(true);
            O8.setVisible(true);
        }
        if(GameBoard.board[2][2] == 1){
            btn_9.setDisable(true);
            X9.setVisible(true);
        }
        else if(GameBoard.board[2][2] == 2){
            btn_9.setDisable(true);
            O9.setVisible(true);
        }
        if(!isOnePlayer) {
            txt_turn.setText("Player " + GameBoard.player + "'s turn");
        }
        else{
            txt_turn.setVisible(false);
        }
        if(GameBoard.checkWinner() == 1){
            txt_winner.setVisible(true);
            if(isOnePlayer){
                txt_winner.setText("You Win!");
            }
            else{
                txt_winner.setText("Player 1 wins!");
            }
            btn_return.setVisible(true);
            btn_return.setDisable(false);
        }
        if(GameBoard.checkWinner() == 2){
            txt_winner.setVisible(true);
            if(isOnePlayer){
                txt_winner.setText("You Lose!");
            }
            else{
                txt_winner.setText("Player 2 wins!");
            }
            btn_return.setVisible(true);
            btn_return.setDisable(false);
        }
        if(GameBoard.checkWinner() == 4){
            txt_winner.setVisible(true);
            txt_winner.setText("It is a tie!");
            btn_return.setVisible(true);
            btn_return.setDisable(false);
        }
        if(GameBoard.checkWinner() != 0){
            btn_1.setDisable(true);
            btn_2.setDisable(true);
            btn_3.setDisable(true);
            btn_4.setDisable(true);
            btn_5.setDisable(true);
            btn_6.setDisable(true);
            btn_7.setDisable(true);
            btn_8.setDisable(true);
            btn_9.setDisable(true);
        }
    }
    public void btn1(ActionEvent actionEvent) throws IOException {
        GameBoard.place(0,0);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn2(ActionEvent actionEvent) throws IOException {
        GameBoard.place(0,1);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn3(ActionEvent actionEvent) throws IOException {
        GameBoard.place(0,2);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn4(ActionEvent actionEvent) throws IOException {
        GameBoard.place(1,0);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn5(ActionEvent actionEvent) throws IOException {
        GameBoard.place(1,1);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn6(ActionEvent actionEvent) throws IOException {
        GameBoard.place(1,2);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn7(ActionEvent actionEvent) throws IOException {
        GameBoard.place(2,0);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn8(ActionEvent actionEvent) throws IOException {
        GameBoard.place(2,1);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void btn9(ActionEvent actionEvent) throws IOException {
        GameBoard.place(2,2);
        check();
        if(isOnePlayer){
            GameBoard.randomMove();
            check();
        }
    }
    public void returnMain(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main_menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.show();
    }
}

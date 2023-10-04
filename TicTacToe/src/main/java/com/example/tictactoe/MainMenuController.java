package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button btn_1player;

    @FXML
    private Button btn_2players;

    public void onePlayer(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
        GameBoard.isOnePlayer = true;
        GameBoard.player = 1;
        GameBoard.reset();
    }
    public void twoPlayers(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Game");
        stage.setScene(scene);
        stage.show();
        GameBoard.isOnePlayer = false;
        GameBoard.player = 1;
        GameBoard.reset();
    }
}

package com.example.firstgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char nowSym ='X';

    private char gameField[][] = new char[3][3];

    private boolean isGame = true;

    @FXML
    void btnClick(ActionEvent event) {
        Button btn =(Button)event.getSource();

        if (!isGame || btn.getText() != "") return;

        int rowIndex = GridPane.getRowIndex(btn) == null ? 0 : GridPane.getRowIndex(btn);
        int columIndex = GridPane.getColumnIndex(btn)== null ? 0: GridPane.getColumnIndex(btn);

        gameField[rowIndex][columIndex]=nowSym;

        btn.setText(String.valueOf(nowSym));

        if (gameField[0][0] == gameField[0][1] && gameField[0][0] == gameField[0][2] && (gameField[0][0]== 'X' || gameField[0][0]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[1][0] == gameField[1][1] && gameField[1][0] == gameField[1][2] && (gameField[1][0]== 'X' || gameField[1][0]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[2][0] == gameField[2][1] && gameField[2][0] == gameField[2][2] && (gameField[2][0]== 'X' || gameField[2][0]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[0][0] == gameField[1][0] && gameField[0][0] == gameField[2][0] && (gameField[0][0]== 'X' || gameField[0][0]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[0][1] == gameField[1][1] && gameField[0][1] == gameField[2][1] && (gameField[0][1]== 'X' || gameField[0][1]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[0][2] == gameField[1][2] && gameField[0][2] == gameField[2][2] && (gameField[0][2]== 'X' || gameField[0][2]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[0][0] == gameField[1][1] && gameField[0][0] == gameField[2][2] && (gameField[0][0]== 'X' || gameField[0][0]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }
        if (gameField[2][2] == gameField[1][1] && gameField[2][2] == gameField[0][2] && (gameField[2][2]== 'X' || gameField[2][2]=='O')){
            Alert alert =new Alert(Alert.AlertType.INFORMATION,"присутній переможець <"+ btn.getText() + ">", ButtonType.OK);
            alert.showAndWait();
            isGame=false;
        }


        nowSym = nowSym == 'X' ?  'O' : 'X' ;
    }

    @FXML
    void initialize() {

    }

}

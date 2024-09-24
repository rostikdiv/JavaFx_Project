module com.example.firstgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstgame to javafx.fxml;
    exports com.example.firstgame;
}
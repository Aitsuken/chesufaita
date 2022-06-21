module kg.kuraido.chesufaita {
    requires javafx.controls;
    requires javafx.fxml;


    opens kg.kuraido.chesufaita to javafx.fxml;
    exports kg.kuraido.chesufaita;
}
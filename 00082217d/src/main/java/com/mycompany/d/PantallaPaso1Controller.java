package com.mycompany.d;

import java.io.IOException;
import javafx.fxml.FXML;

public class PantallaPaso1Controller {

    @FXML
    private void siguiente() throws IOException {
        App.setRoot("PantallaPaso2");
    }
}
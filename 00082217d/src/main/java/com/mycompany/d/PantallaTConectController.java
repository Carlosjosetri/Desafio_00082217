package com.mycompany.d;

import java.io.IOException;
import javafx.fxml.FXML;

public class PantallaTConectController {

    @FXML
    private void siguiente() throws IOException {
        App.setRoot("PantallaPasos");
    }
}
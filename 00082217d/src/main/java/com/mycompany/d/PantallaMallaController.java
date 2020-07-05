package com.mycompany.d;

import java.io.IOException;
import javafx.fxml.FXML;

public class PantallaMallaController {

    @FXML
    private void siguiente() throws IOException {
        App.setRoot("PantallaTconect");
    }
}
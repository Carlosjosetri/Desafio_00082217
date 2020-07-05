package com.mycompany.d;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void siguiente() throws IOException {
        App.setRoot("PantallaDominio");
    }
}
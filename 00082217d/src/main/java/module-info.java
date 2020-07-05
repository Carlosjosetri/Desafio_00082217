/* doesn't work with source level 1.8:
module com.mycompany.d {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.d to javafx.fxml;
    exports com.mycompany.d;
}
*/

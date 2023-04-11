module com.mycompany.screenbuilderproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.screenbuilderproject to javafx.fxml;
    exports com.mycompany.screenbuilderproject;
}

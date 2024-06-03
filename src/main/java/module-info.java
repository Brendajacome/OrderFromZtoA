module com.example.orderfromztoa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.orderfromztoa to javafx.fxml;
    exports com.example.orderfromztoa;
}
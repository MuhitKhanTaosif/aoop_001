module com.example.p_r {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.p_r to javafx.fxml;
    exports com.example.p_r;
}
module com.qtk.javafxquizapp.dh23it01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires lombok;
    opens com.qtk.javafxquizapp.dh23it01 to javafx.fxml;
    exports com.qtk.javafxquizapp.dh23it01;
}

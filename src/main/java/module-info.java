module com.example.search_engine {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.search_engine to javafx.fxml;
    exports com.example.search_engine;
}
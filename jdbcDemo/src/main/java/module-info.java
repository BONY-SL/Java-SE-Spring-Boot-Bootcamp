module org.jdbc.demo.jdbcdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.jdbc.demo.jdbcdemo to javafx.fxml;
    exports org.jdbc.demo.jdbcdemo;
}
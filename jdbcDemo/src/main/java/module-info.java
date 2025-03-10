module org.jdbc.demo.jdbcdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;

    opens org.jdbc.demo.jdbcdemo to javafx.fxml;
    exports org.jdbc.demo.jdbcdemo;
}
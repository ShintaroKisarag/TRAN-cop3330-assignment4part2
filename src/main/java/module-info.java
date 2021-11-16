module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;

    opens com.example.trancop3330assignment4part2 to javafx.fxml;
    exports com.example.trancop3330assignment4part2;

}
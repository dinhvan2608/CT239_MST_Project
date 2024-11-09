module com.mst {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.mst to javafx.fxml;
    exports com.mst;
    exports com.mst.graph;
    exports com.mst.controller;
}
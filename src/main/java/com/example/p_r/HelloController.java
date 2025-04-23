package com.example.p_r;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;

public class HelloController {

    @FXML private Button btnVeriables;
    @FXML private Button btnData;
    @FXML private Button btnAnalysis;
    @FXML private Button btnEdit;

    @FXML private ToolBar toolbarVeriables;
    @FXML private ToolBar toolbarData;
    @FXML private ToolBar toolbarAnalysis;
    @FXML private ToolBar toolbarEdit;

    @FXML
    private void initialize() {
        // Initial visible toolbar
        showToolbar("veriables");

        // Set actions for top buttons
        btnVeriables.setOnAction(e -> showToolbar("veriables"));
        btnData.setOnAction(e -> showToolbar("data"));
        btnAnalysis.setOnAction(e -> showToolbar("analysis"));
        btnEdit.setOnAction(e -> showToolbar("edit"));
    }

    private void showToolbar(String name) {
        // Hide all toolbars first
        toolbarVeriables.setVisible(false);
        toolbarVeriables.setManaged(false);

        toolbarData.setVisible(false);
        toolbarData.setManaged(false);

        toolbarAnalysis.setVisible(false);
        toolbarAnalysis.setManaged(false);

        toolbarEdit.setVisible(false);
        toolbarEdit.setManaged(false);

        // Show selected toolbar
        switch (name) {
            case "veriables":
                toolbarVeriables.setVisible(true);
                toolbarVeriables.setManaged(true);
                break;
            case "data":
                toolbarData.setVisible(true);
                toolbarData.setManaged(true);
                break;
            case "analysis":
                toolbarAnalysis.setVisible(true);
                toolbarAnalysis.setManaged(true);
                break;
            case "edit":
                toolbarEdit.setVisible(true);
                toolbarEdit.setManaged(true);
                break;
        }
    }
}

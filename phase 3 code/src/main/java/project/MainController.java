package project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField asuid;

    @FXML
    private RadioButton emp;

    @FXML
    private Button login;

    @FXML
    private TextField pss;

    @FXML
    private RadioButton std;

    MainApplication app = new MainApplication();

    @FXML
    private Button placeOrd;

    @FXML
    private Button trackOrd;

    @FXML
    private Button orderPlaced;

    @FXML
    private CheckBox olive;

    @FXML
    private CheckBox onion;

    @FXML
    private Button back;
    @FXML
    private RadioButton vegetable;

    @FXML
    private CheckBox mush;

    @FXML
    private CheckBox extraCheese;

    @FXML
    private RadioButton peperoni;

    @FXML
    private RadioButton cheese;

    @FXML
    private Button readyOrd;

    @FXML
    private Button accOrd;

    @FXML
    private Button readyCOrd;

    @FXML
    private Button statusOrd;

    @FXML
    private Button moverc;

    @FXML
    private Button moveAcc;

    @FXML
    void moveAccClicked(ActionEvent event) {

    }

    @FXML
    void backClicked(ActionEvent event) {
        app.changeScene("employee_main.fxml");
    }

    @FXML
    void movercClicked(ActionEvent event) {

    }

    @FXML
    void accOrdClicked(ActionEvent event) {
        app.changeScene("accepted_orders.fxml");
    }

    @FXML
    void readyCOrdClicked(ActionEvent event) {
        app.changeScene("ready_to_cook.fxml");
    }

    @FXML
    void readyOrdClicked(ActionEvent event) {
        app.changeScene("cooking_orders.fxml");
        statusOrd.setText("READY");
    }

    @FXML
    void toppingsClicked(ActionEvent event) {

    }

    @FXML
    void typeClicked(ActionEvent event) {

    }

    @FXML
    void orderPlacedClicked(ActionEvent event) {
        app.changeScene("student_main.fxml");
    }

    @FXML
    void PlaceOrdClicked(ActionEvent event) {
        app.changeScene("place_order.fxml");
    }

    @FXML
    void trackOrdClicked(ActionEvent event) {
        app.changeScene("order_status.fxml");
    }

    @FXML
    void studentClicked(ActionEvent event) {
        if(emp.isSelected()) {
            emp.selectedProperty().set(false);
        }
    }

    @FXML
    void employeeClicked(ActionEvent event) {
        if(std.isSelected()) {
            std.selectedProperty().set(false);
        }
    }

    @FXML
    void loginClicked(ActionEvent event) {
        if(std.isSelected() && app.getStudent(asuid.getText()) != null) {
            app.changeScene("student_main.fxml");
        }
        if(emp.isSelected() && app.getEmployee(asuid.getText()) != null) {
            app.changeScene("employee_main.fxml");
        }
    }

}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MyController {

    @FXML
    private TextField tf_name;

    @FXML
    void onSubmitClick(ActionEvent event) {
    	System.out.println(tf_name.getText());
    }

}

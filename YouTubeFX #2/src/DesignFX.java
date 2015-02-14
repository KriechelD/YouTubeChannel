import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DesignFX extends Application {

	Label lb_text;
	Button btn_click;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		DropShadow ds = new DropShadow();
		ds.setOffsetY(5.0);
		ds.setOffsetX(5.0);
		ds.setColor(Color.GRAY);

		Reflection reflection = new Reflection();
		reflection.setFraction(0.8);
		reflection.setTopOffset(-20);

		lb_text = new Label("Here some Text");
		btn_click = new Button("Click it");

		btn_click.setEffect(ds);
		lb_text.setEffect(reflection);

		lb_text.getStyleClass().add("my_customLabel");

		btn_click.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				lb_text.setText("New Text");
			}
		});

		VBox root = new VBox();
		root.getChildren().addAll(lb_text, btn_click);

		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);

		scene.getStylesheets().add("myStyle.css");

		stage.show();

	}
}

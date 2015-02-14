import java.util.Date;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

public class ComboBoxFX extends Application {

	ComboBox<Person> comboBox;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		comboBox = new ComboBox<>();

		comboBox.setItems(getPersonDummy());

		comboBox.getSelectionModel().select(1);

		comboBox.valueProperty().addListener(new ChangeListener<Person>() {

			@Override
			public void changed(ObservableValue<? extends Person> arg0, Person person_before, Person person_after) {
				if (person_before != null) {
					System.out.print(person_before.getFirstname() + "->");
				}
				System.out.println(person_after.getFirstname());
			}

		});

		comboBox.setCellFactory(new Callback<ListView<Person>, ListCell<Person>>() {

			@Override
			public ListCell<Person> call(ListView<Person> arg0) {
				ListCell<Person> cell = new ListCell<Person>() {

					@Override
					public void updateItem(Person person, boolean empty) {
						super.updateItem(person, empty);
						if (person != null) {
							setText(person.toString());
							if (person.getFirstname().equals("Max")) {
								setTextFill(Color.RED);
							}
						} else {
							setText(null);
						}
					}

				};
				return cell;
			}
		});
	}

	@Override
	public void start(Stage stage) throws Exception {

		VBox root = new VBox();
		root.getChildren().addAll(comboBox);

		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);

		stage.show();

	}

	public static ObservableList<Person> getPersonDummy() {
		ObservableList<Person> data = FXCollections.observableArrayList();

		data.addAll(new Person("Max", "Mustermann", new Date()));
		data.addAll(new Person("John", "Doe", new Date()));
		data.addAll(new Person("Random", "User", new Date()));

		return data;
	}
}

import java.util.ArrayList;
import java.util.Date;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Person {

	private String firstname, lastname;
	private Date birthdate;

	public Person(String firstname, String lastname, Date birthdate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public static ArrayList<TableColumn<Person, ?>> getColumn(TableView table) {

		int i;

		ArrayList<TableColumn<Person, ?>> columns = new ArrayList<TableColumn<Person, ?>>();

		String[] columnNames = { "Firstname", "Lastname", "Birthdate" };
		String[] variableNames = { "firstname", "lastname", "birthdate" };
		Integer[] column_width = { 33, 33, 33 };

		i = 0;
		TableColumn<Person, String> firstnameCol = new TableColumn<>(columnNames[i++]);
		TableColumn<Person, String> lastenameCol = new TableColumn<>(columnNames[i++]);
		TableColumn<Person, Date> birthdateCol = new TableColumn<>(columnNames[i++]);

		i = 0;
		firstnameCol.prefWidthProperty().bind(table.widthProperty().divide(100 / column_width[i++]));
		lastenameCol.prefWidthProperty().bind(table.widthProperty().divide(100 / column_width[i++]));
		birthdateCol.prefWidthProperty().bind(table.widthProperty().divide(100 / column_width[i++]));

		i = 0;
		firstnameCol.setCellValueFactory(new PropertyValueFactory<Person, String>(variableNames[i++]));
		lastenameCol.setCellValueFactory(new PropertyValueFactory<Person, String>(variableNames[i++]));
		birthdateCol.setCellValueFactory(new PropertyValueFactory<Person, Date>(variableNames[i++]));

		columns.add(firstnameCol);
		columns.add(lastenameCol);
		columns.add(birthdateCol);

		return columns;

	}
}

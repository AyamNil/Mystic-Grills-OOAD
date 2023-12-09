package View;

import Model.MenuItem;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class AddMenuItemView {
	private TableView<MenuItem> table_view;
	private TextField name_field, id_field, description_field, price_field;
	private Button add_button;
	private GridPane form;
	private VBox vbox;
	
	public AddMenuItemView() {
		InitTableView();
		InitForm();
		
		vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setPadding(new Insets(10));
        
        vbox.getChildren().addAll(table_view, form);
	}
	
	private void InitTableView() {
		table_view = new TableView<>();
		
		TableColumn<MenuItem, Integer> id_column = new TableColumn<>("ID");
		id_column.setCellValueFactory(new PropertyValueFactory<>("id"));
		TableColumn<MenuItem, String> name_column = new TableColumn<>("Name");
		name_column.setCellValueFactory(new PropertyValueFactory<>("name"));
		TableColumn<MenuItem, String> description_column = new TableColumn<>("Description");
		description_column.setCellValueFactory(new PropertyValueFactory<>("description"));
		TableColumn<MenuItem, Integer> price_column = new TableColumn<>("Price");
		price_column.setCellValueFactory(new PropertyValueFactory<>("price"));
	
		table_view.getColumns().addAll(id_column, name_column, description_column, price_column);
			
	}
	
	private void InitForm() {
		name_field = new TextField();
		id_field = new TextField();
		id_field.setVisible(false);
		description_field = new TextField();
		price_field = new TextField();
		add_button = new Button("Add");
	
		form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(10, 10, 10, 10));

//        form.add(new Label("ID:"), 0, 0);
//        form.add(id_field, 1, 0);
        form.add(new Label("Name:"), 0, 1);
        form.add(name_field, 1, 1);
        form.add(new Label("Description:"), 0, 2);
        form.add(description_field, 1, 2);
        form.add(new Label("Price:"), 0, 3);
        form.add(price_field, 1, 3);
        
        
        form.add(add_button, 0, 4, 2, 1);
	}
	
	public Scene getScene() {
		return new Scene(vbox, 400, 400);
	}

	public TableView<MenuItem> getTable_view() {
		return table_view;
	}

	public void setTable_view(TableView<MenuItem> table_view) {
		this.table_view = table_view;
	}

	public TextField getName_field() {
		return name_field;
	}

	public void setName_field(TextField name_field) {
		this.name_field = name_field;
	}

	public TextField getId_field() {
		return id_field;
	}

	public void setId_field(TextField id_field) {
		this.id_field = id_field;
	}

	public TextField getDescription_field() {
		return description_field;
	}

	public void setDescription_field(TextField description_field) {
		this.description_field = description_field;
	}

	public TextField getPrice_field() {
		return price_field;
	}

	public void setPrice_field(TextField price_field) {
		this.price_field = price_field;
	}

	public Button getAdd_button() {
		return add_button;
	}

	public void setAdd_button(Button add_button) {
		this.add_button = add_button;
	}

	public GridPane getForm() {
		return form;
	}

	public void setForm(GridPane form) {
		this.form = form;
	}
	
	
}
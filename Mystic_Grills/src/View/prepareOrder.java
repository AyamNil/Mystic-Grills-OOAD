package View;

import Model.Order;
import Model.OrderItem;
import View.TableView.OrderTable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class prepareOrder {
	private TableView<Order> table_view;
	private TextField id_field, name_field;
	private Button serve_button, back_button;
	private GridPane form;
	private VBox vbox;
	
	
	public prepareOrder() {
		TableView<OrderItem> table = new OrderTable().getTable_view();
		InitForm();
		
	}
	
	private void InitForm() {
		name_field = new TextField();
		id_field = new TextField();
		id_field.setVisible(false);
		serve_button = new Button("Serve");
		form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(10, 10, 10, 10));
        
        form.add(new Label("Name:"), 0, 1);
        form.add(name_field, 1, 1);
        form.add(new Label("Quantity:"), 0, 2);
        form.add(serve_button, 0, 4);
        form.add(back_button, 0, 5);
	}
	
	public Scene getScene() {
		return new Scene(vbox, 400, 400);
	}

	public TableView<Order> getTable_view() {
		return table_view;
	}

	public void setTable_view(TableView<Order> table_view) {
		this.table_view = table_view;
	}

	public TextField getId_field() {
		return id_field;
	}

	public void setId_field(TextField id_field) {
		this.id_field = id_field;
	}

	public TextField getName_field() {
		return name_field;
	}

	public void setName_field(TextField name_field) {
		this.name_field = name_field;
	}

	public Button getOrder_button() {
		return serve_button;
	}

	public void setOrder_button(Button order_button) {
		this.serve_button = order_button;
	}

	public GridPane getForm() {
		return form;
	}

	public void setForm(GridPane form) {
		this.form = form;
	}

	public VBox getVbox() {
		return vbox;
	}

	public void setVbox(VBox vbox) {
		this.vbox = vbox;
	}
	
	

}

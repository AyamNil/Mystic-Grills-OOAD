package View.TableView;


import java.util.Date;

import Model.MenuItem;
import Model.Order;
import Model.OrderItem;
import Model.User;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class OrderTable {

	private TableView<Order> table_view;
	
	public OrderTable() {
		InitTableView();
	}
	
	@SuppressWarnings("unused")
	private void InitTableView() {
		TableColumn<Order, Integer> id_column = new TableColumn<>("ID");
		id_column.setCellValueFactory(new PropertyValueFactory<>("id"));
		TableColumn<Order, String> user_id_column = new TableColumn<>("User_id");
		user_id_column.setCellValueFactory(new PropertyValueFactory<>("user_id"));
		TableColumn<Order, String> order_item_id_column = new TableColumn<>("Order_item_id");
		order_item_id_column.setCellValueFactory(new PropertyValueFactory<>("order_item_id"));
		TableColumn<Order, String> status_column = new TableColumn<>("Status");
		status_column.setCellValueFactory(new PropertyValueFactory<>("status"));
		TableColumn<Order, Date> date_column = new TableColumn<>("Date");
		date_column.setCellValueFactory(new PropertyValueFactory<>("date"));
		TableColumn<Order, Integer> total_column = new TableColumn<>("Total");
		total_column.setCellValueFactory(new PropertyValueFactory<>("total"));
		
		
		table_view.getColumns().addAll(id_column, user_id_column, order_item_id_column, status_column,date_column,total_column);
	}

	public TableView<Order> getTable_view() {
		return table_view;
	}
	
	

}

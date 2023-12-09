package Controller;

import java.util.ArrayList;

import Model.MenuItem;
import View.AddMenuItemView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MenuItemController {
	private AddMenuItemView add_menuitem_view;
	private Stage primary_stage;
	
	public MenuItemController(AddMenuItemView _add_menuitem_view, Stage _primary_stage) {
		add_menuitem_view = _add_menuitem_view;
		primary_stage = _primary_stage;
		LoadData();
		Listeners();
	}
	
	public void Listeners() {
		add_menuitem_view.getAdd_button().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				int price = Integer.parseInt(
							add_menuitem_view.getPrice_field().getText().toString()
						);
				String name = add_menuitem_view.getName_field().getText().toString();
				if(Validator.ValidateName(name) != Validator.VALID){
		            ShowInfoAlert("invalid name", "invalid name", "error");
		            return;
		        }
				String description = add_menuitem_view.getDescription_field().getText().toString();
				if(Validator.ValidateName(description) != Validator.VALID){
		            ShowInfoAlert("invalid desc", "invalid desc", "error");
		            return;
		        }
				
				MenuItem new_menuitem = new MenuItem(name, description, price);
				MenuItem.AddNew(new_menuitem);
				LoadData();
			}
			
		});
	}
	
	public void LoadData() {
		ArrayList<MenuItem> menuitems = MenuItem.getAll();
		ObservableList<MenuItem> observable_menuitems = FXCollections.observableArrayList(menuitems);
		add_menuitem_view.getTable_view().setItems(observable_menuitems);
	}
	
	private void ShowInfoAlert(String title, String content, String alert_type) {
        Alert alert;
        if(alert_type == "error"){
            alert = new Alert(Alert.AlertType.ERROR);
        }
        else{
            alert = new Alert(Alert.AlertType.INFORMATION);
        }
        
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

package elemetents;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public interface Buttons {

	public default Button btn(String text, String tooltip) {
		Button btn = new Button();
		btn.setText(text);
	
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
			action();
			}
		});
		return btn;
	}
	
	public default void action() {
		System.out.println("Hello World!");
		
	}
}

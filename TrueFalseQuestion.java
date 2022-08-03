package application;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.layout.HBox;

public class TrueFalseQuestion extends Question {
	Button[] choices;
	public HBox choicesLayout = new HBox(); // layout for choices
	
	TrueFalseQuestion(String question, String correctAnswer) 
	{
		super(question, correctAnswer);
		choices = new Button[] {new Button("TRUE"), new Button("FALSE")};
		choicesLayout.getChildren().addAll(choices);
		choicesLayout.setMaxWidth(100);
	}

	@Override
	Node getChoicesLayout() {
		return choicesLayout;
	}

	@Override
	ButtonBase[] getChoices() {
		return choices;
	}

}

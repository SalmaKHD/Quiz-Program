package application;

import javafx.scene.Node;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class MultipleChoiceQuestion extends Question {
	public RadioButton[] choices;
	VBox choicesLayout = new VBox(); // layout for choices
	
	MultipleChoiceQuestion(String question, String correctAnswer,
			String a, String b, String c, String d)
	{
		super(question, correctAnswer);
		choices = new RadioButton[] {new RadioButton(a), new RadioButton(b), new RadioButton(c), new RadioButton(d)};
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


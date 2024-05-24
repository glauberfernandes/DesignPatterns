package criacionais.abstract_factory.example.factories;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.buttons.WindowsButton;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.checkboxes.WindowsCheckbox;

/**
 * Cada fábrica concreta estende a fábrica base e é responsável por criar
 * produtos de uma única variedade.
 */
public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}

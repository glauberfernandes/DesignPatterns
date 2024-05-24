package criacionais.abstract_factory.example.factories;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.buttons.WindowsButton;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.checkboxes.WindowsCheckbox;

/**
 * Cada f�brica concreta estende a f�brica base e � respons�vel por criar
 * produtos de uma �nica variedade.
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

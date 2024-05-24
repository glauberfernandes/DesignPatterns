package criacionais.abstract_factory.example.factories;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.buttons.MacOSButton;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Cada f�brica concreta estende f�brica base e � respons�vel por criar produtos
 * de uma �nica variedade.
 */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}

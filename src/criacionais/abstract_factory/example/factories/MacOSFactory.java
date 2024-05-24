package criacionais.abstract_factory.example.factories;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.buttons.MacOSButton;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Cada fábrica concreta estende fábrica base e é responsável por criar produtos
 * de uma única variedade.
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

package criacionais.abstract_factory.example.factories;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.checkboxes.Checkbox;

/**
 * Fábrica abstrata sabe sobre todos os tipos de produtos (abstratos).
 */
public interface GUIFactory {
	Button createButton();

	Checkbox createCheckbox();
}

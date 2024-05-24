package criacionais.abstract_factory.example.app;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.factories.GUIFactory;

/**
 * Os usuários da fábrica não se importam com qual fábrica concreta eles usam,
 * uma vez que trabalham com fábricas e produtos através de interfaces
 * abstratas.
 */
public class Application {

	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}
}

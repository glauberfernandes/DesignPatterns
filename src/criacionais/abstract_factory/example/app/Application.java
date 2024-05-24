package criacionais.abstract_factory.example.app;

import criacionais.abstract_factory.example.buttons.Button;
import criacionais.abstract_factory.example.checkboxes.Checkbox;
import criacionais.abstract_factory.example.factories.GUIFactory;

/**
 * Os usu�rios da f�brica n�o se importam com qual f�brica concreta eles usam,
 * uma vez que trabalham com f�bricas e produtos atrav�s de interfaces
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

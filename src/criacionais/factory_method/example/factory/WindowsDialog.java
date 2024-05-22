package criacionais.factory_method.example.factory;

import criacionais.factory_method.example.buttons.Button;
import criacionais.factory_method.example.buttons.WindowsButton;

/**
 * Mais um criador concreto.
 * <p>
 * Windows Dialog produzirá botões Windows.
 * </p>
 * @author glauber.fernandes
 *
 */
public class WindowsDialog extends Dialog{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}

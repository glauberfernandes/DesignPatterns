package criacionais.factory_method.example.factory;

import criacionais.factory_method.example.buttons.Button;
import criacionais.factory_method.example.buttons.HtmlButton;

/**
 * Criador concreto.
 * <p>
 * HTML Dialog produzir� bot�es HTML.
 * </p>
 * @author glauber.fernandes
 *
 */
public class HtmlDialog extends Dialog{

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}

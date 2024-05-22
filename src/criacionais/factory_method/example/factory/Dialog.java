package criacionais.factory_method.example.factory;

import criacionais.factory_method.example.buttons.Button;

/**
 * Criador base
 * <p>
 * Classe base de f�brica. Note que "f�brica" � apenas um papel para a classe. Ela
 * deve ter alguma l�gica de neg�cio principal que precisa de produtos diferentes para ser
 * Criado.
 * </p>
 * @author glauber.fernandes
 *
 */
public abstract class Dialog {

	public void renderWindow(){
		// ... other code ...
		
		Button okButton = createButton();
		okButton.render();
	}
	
	/**
	 * As subclasses substituir�o esse m�todo para criar um bot�o espec�fico de objetos.
	 * @return
	 */
	public abstract Button createButton();
}

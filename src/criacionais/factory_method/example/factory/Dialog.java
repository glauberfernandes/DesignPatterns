package criacionais.factory_method.example.factory;

import criacionais.factory_method.example.buttons.Button;

/**
 * Criador base
 * <p>
 * Classe base de fábrica. Note que "fábrica" é apenas um papel para a classe. Ela
 * deve ter alguma lógica de negócio principal que precisa de produtos diferentes para ser
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
	 * As subclasses substituirão esse método para criar um botão específico de objetos.
	 * @return
	 */
	public abstract Button createButton();
}

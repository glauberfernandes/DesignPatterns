package criacionais.abstract_factory.example;

import criacionais.abstract_factory.example.app.Application;
import criacionais.abstract_factory.example.factories.GUIFactory;
import criacionais.abstract_factory.example.factories.MacOSFactory;
import criacionais.abstract_factory.example.factories.WindowsFactory;

/**
 * Classe demo. Tudo se junta aqui.
 */
public class Demo {

	/**
	 * O aplicativo escolhe o tipo de f�brica e o cria em tempo de execu��o
	 * (geralmente em est�gio de inicializa��o), dependendo da configura��o ou
	 * ambiente Vari�veis.
	 */
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;

		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
		} else {
			factory = new WindowsFactory();
		}

		app = new Application(factory);
		return app;
	}
	
	public static void main(String[] args){
		Application app = configureApplication();
		app.paint();
	}
}

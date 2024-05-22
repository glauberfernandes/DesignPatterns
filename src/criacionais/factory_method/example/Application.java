package criacionais.factory_method.example;

import criacionais.factory_method.example.factory.Dialog;
import criacionais.factory_method.example.factory.HtmlDialog;
import criacionais.factory_method.example.factory.WindowsDialog;

/**
 * Classe de demonstra��o. Tudo se junta aqui.
 * @author glauber.fernandes
 *
 */
public class Application {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		
		configure();
		runBusinessLogic();
		
		System.out.println(System.getProperties());
	}

	/**
	 * A concretiza��o do factory � geralmente escolhida dependendo da configura��o ou
     * op��es de ambiente.
	 */
	static void configure(){
		if (System.getProperty("os.name").equals("Windows 11")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	/**
	 * Todo o c�digo do cliente deve funcionar com f�bricas e produtos atrav�s de interfaces abstratas. 
	 * Dessa forma, ele n�o se importa com qual f�brica ele funciona
     *  com e que tipo de produto ele retorna.
	 */
	static void runBusinessLogic(){
		dialog.renderWindow();
	}
}

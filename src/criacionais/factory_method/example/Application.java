package criacionais.factory_method.example;

import criacionais.factory_method.example.factory.Dialog;
import criacionais.factory_method.example.factory.HtmlDialog;
import criacionais.factory_method.example.factory.WindowsDialog;

/**
 * Classe de demonstração. Tudo se junta aqui.
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
	 * A concretização do factory é geralmente escolhida dependendo da configuração ou
     * opções de ambiente.
	 */
	static void configure(){
		if (System.getProperty("os.name").equals("Windows 11")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	/**
	 * Todo o código do cliente deve funcionar com fábricas e produtos através de interfaces abstratas. 
	 * Dessa forma, ele não se importa com qual fábrica ele funciona
     *  com e que tipo de produto ele retorna.
	 */
	static void runBusinessLogic(){
		dialog.renderWindow();
	}
}

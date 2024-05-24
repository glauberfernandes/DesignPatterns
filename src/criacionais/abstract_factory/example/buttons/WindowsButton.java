package criacionais.abstract_factory.example.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a button.
 * </p>
 * 
 * 
 * Todas as fam�lias de produtos t�m as mesmas variedades (MacOS/Windows).
 * <p>
 * Esta � outra variante de um bot�o.
 * </p>
 * @author glauber.fernandes
 *
 */
public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("You have created WindowsButton.");
	}

}

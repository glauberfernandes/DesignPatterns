package criacionais.abstract_factory.example.buttons;

/**
 * Todas as fam�lias de produtos t�m as mesmas variedades (MacOS/Windows).
 * <p>
 * Esta � uma variante de um bot�o do MacOS.
 *</p>
 * @author glauber.fernandes
 *
 */
public class MacOSButton implements Button {

	@Override
	public void paint() {

		System.out.println("You have created MacOSButton");
	}

}

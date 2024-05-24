package criacionais.abstract_factory.example.buttons;

/**
 * Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).
 * <p>
 * Esta é uma variante de um botão do MacOS.
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

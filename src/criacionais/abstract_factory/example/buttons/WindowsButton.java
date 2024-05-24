package criacionais.abstract_factory.example.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a button.
 * </p>
 * 
 * 
 * Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).
 * <p>
 * Esta é outra variante de um botão.
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

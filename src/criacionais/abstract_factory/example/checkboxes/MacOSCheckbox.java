package criacionais.abstract_factory.example.checkboxes;

/**
 * Todas as famílias de produtos têm as mesmas variedades (MacOS/Windows).
 *
 * Esta é uma variante de uma caixa de seleção.
 */
public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("You have created MacOSCheckbox.");
	}

}

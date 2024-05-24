package criacionais.abstract_factory.example.checkboxes;

/**
 * Todas as fam�lias de produtos t�m as mesmas variedades (MacOS/Windows).
 *
 * Esta � uma variante de uma caixa de sele��o.
 */
public class MacOSCheckbox implements Checkbox {

	@Override
	public void paint() {
		System.out.println("You have created MacOSCheckbox.");
	}

}

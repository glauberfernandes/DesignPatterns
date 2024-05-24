package criacionais.abstract_factory.example.buttons;

/**
 * Abstract Factory assume que voc� tem v�rias fam�lias de produtos, estruturado
 * em hierarquias de classe separadas (Button/Checkbox). Todos os produtos da
 * mesma fam�lia tem a interface comum.
 * <p>
 * Esta � a interface comum para a fam�lia de bot�es.
 * </p>
 * 
 * @author glauber.fernandes
 *
 */
public interface Button {
	void paint();
}

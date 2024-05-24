package criacionais.abstract_factory.example.buttons;

/**
 * Abstract Factory assume que você tem várias famílias de produtos, estruturado
 * em hierarquias de classe separadas (Button/Checkbox). Todos os produtos da
 * mesma família tem a interface comum.
 * <p>
 * Esta é a interface comum para a família de botões.
 * </p>
 * 
 * @author glauber.fernandes
 *
 */
public interface Button {
	void paint();
}

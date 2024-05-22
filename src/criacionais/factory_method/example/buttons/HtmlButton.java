package criacionais.factory_method.example.buttons;

/**
 * Produto concreto que implementa a interface.
 * @author glauber.fernandes
 *
 */
public class HtmlButton implements Button {

	@Override
	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	@Override
	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");
	}

}

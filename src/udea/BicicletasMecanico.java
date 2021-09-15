package udea;

import java.util.ArrayList;
import java.util.List;

public class BicicletasMecanico {

	private List<String> misPedales;

	public BicicletasMecanico() {
		misPedales = new ArrayList<>();
	}

	public List<String> getMisPedales() {
		return misPedales;
	}

	public void setMisPedales(List<String> misPedales) {
		this.misPedales = misPedales;
	}

	public void ponerPedales(Bicicleta unaCicla) {
		String pedalesAPoner = this.misPedales.get(0);
		unaCicla.setPedales(pedalesAPoner);
		this.misPedales.remove(0);
		System.out.println("Pongo pedales de marca " + pedalesAPoner +
				" a una " + unaCicla.getClass().getName());
	}
}

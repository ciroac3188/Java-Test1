package udea;

public class Jugador extends Personaje {
	// ^ (Jugador hereda de Personaje)
	// Inserte aca los atributos
	private int numeroBotiquines = 0;

	// Inserte aca el metodo constructor
	public Jugador(String nombreJ, char sexoJ, int posicionXJ, int posicionYJ, int damageJ) {
		super(nombreJ, sexoJ, posicionXJ, posicionYJ, damageJ);
	}

	// Inserte aca los metodos (NO LOS GETTER Y SETTERS)
	public void moverDerecha(double d) {
		this.setPosicionX(this.getPosicionX() + d);
	}

	public void moverIzquierda(double d) {
		this.setPosicionX(this.getPosicionX() - d);
	}

	public void moverArriba(double d) {
		this.setPosicionY(this.getPosicionY() + d);
	}

	public void moverAbajo(double d) {
		this.setPosicionY(this.getPosicionY() - d);
	}

	public void recogerBotiquin() {
		this.numeroBotiquines += 1;
	}

	public void usarBotiquin() {
		if (this.numeroBotiquines > 0) {
			this.numeroBotiquines -= 1;
			this.setVida(this.getVida() + 5);
		}
	}

	public void golpear(Enemigo p) {
		super.golpear(p);
		p.evolucionar();
	}

	// Inserte aca los SETTERS Y GETTERS
	public int getNumeroBotiquines() {
		return numeroBotiquines;
	}

	public void setNumeroBotiquines(int numeroBotiquines) {
		this.numeroBotiquines = numeroBotiquines;
	}

}

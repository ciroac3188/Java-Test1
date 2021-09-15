package udea;

public class PruebaVideoJuego {

	public static void main(String[] args) {
		Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
		Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
		System.out.println("Empiece el juego");
		j.golpear(e);
		j.golpear(e);
		j.moverDerecha(10);
		j.moverAbajo(5);
		
		e.golpear(j);
		e.golpear(j);
		j.recogerBotiquin();
		
		j.usarBotiquin();
		j.usarBotiquin();
		j.golpear(e);
		j.golpear(e);
		j.golpear(e);
		
		e.golpear(j);
		e.golpear(j);
		
		j.golpear(e);
		j.golpear(e);
		
		j.golpear(e);
		j.golpear(e);
		j.golpear(e);
	}

}

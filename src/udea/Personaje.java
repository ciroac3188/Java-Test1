package udea;

public class Personaje {
	//Inserte aca los atributos
	private String nombre;
	private char sexo;
	private double posicionX;
	private double posicionY;
	private double damage;
	private double vida;
	
	//Inserte aca el metodo constructor
	public Personaje(String nombreP, char sexoP, int posicionXP, int posicionYP,
			int damageP) {
		this.nombre = nombreP;
		this.sexo = sexoP;
		this.posicionX = posicionXP;
		this.posicionY = posicionYP;
		this.damage = damageP;
		this.vida = 100;
	}
	
	//Inserte aca los metodos (NO LOS GETTER Y SETTERS)
	public void golpear(Personaje p) {
		double golpe;
		golpe = this.getDamage() / this.calcularDistanciaRespectoPersonaje(p);
		p.recibirImpacto(golpe); 
	}
	
	public void recibirImpacto(double d) {
		this.setVida(this.getVida() - d);
	}
	
	public double calcularDistanciaRespectoPersonaje(Personaje p) {
		double distancia;
		
		distancia = Math.sqrt(Math.pow(this.getPosicionX() - p.getPosicionX(), 2) +
				Math.pow(this.getPosicionY() - p.getPosicionY(), 2));
		return distancia;
	}
	
	//Inserte aca los SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		if (vida > 100) {
			vida = 100;
		}else if (vida < 0) {
			vida = 0;
		}
		this.vida = vida;
	}	
}


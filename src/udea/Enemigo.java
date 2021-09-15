package udea;

public class Enemigo extends Personaje {
    //              ^ (Enemigo hereda de Personaje)
    //Inserte aca los atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;
    
    //Inserte aca el metodo constructor
    public Enemigo(String nombreJ, char sexoJ, int posicionXJ, int posicionYJ, 
			int damageJ) {
    	super(nombreJ, sexoJ, posicionXJ, posicionYJ, damageJ);
    }
        
    //Inserte aca los metodos (NO LOS GETTER Y SETTERS)
    public void evolucionar() {
    	if (this.getVida() <= 30 && this.getEvolucionesAplicadas() == 0) {
    		this.setDamage(this.getDamage() + 20);
    		this.setEvolucionesAplicadas(this.getEvolucionesAplicadas() + 1);
    	}
    	if (this.getVida() <= 10 && this.getEvolucionesAplicadas() == 1) {
    		this.setResistencia(this.getResistencia() + 1);
    		this.setEvolucionesAplicadas(this.getEvolucionesAplicadas() + 1);
    	}
    }
    
    public void recibirImpacto(double d) {
    	this.setVida(this.getVida() - (d / this.getResistencia()));
    }

    //Inserte aca los SETTERS Y GETTERS
	public int getEvolucionesAplicadas() {
		return evolucionesAplicadas;
	}

	public void setEvolucionesAplicadas(int evolucionesAplicadas) {
		this.evolucionesAplicadas = evolucionesAplicadas;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	} 
    
}

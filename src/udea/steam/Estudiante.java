package udea.steam;

public class Estudiante extends Persona {

    
    //Inserte acá el método constructor
    public Estudiante(String idP, String nombreP, String emailP, String idiomaP) {
		super(idP, nombreP, emailP, idiomaP);
	}

	//Inserte acá la implementación del método abstracto de la clase padre
	@Override
	public void dirigir() {
		super.setUrl("educursos.com/" + this.getIdioma() + "/estudiante");
	}

}

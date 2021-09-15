package udea.steam;

public class Estudiante extends Persona {

    
    //Inserte ac� el m�todo constructor
    public Estudiante(String idP, String nombreP, String emailP, String idiomaP) {
		super(idP, nombreP, emailP, idiomaP);
	}

	//Inserte ac� la implementaci�n del m�todo abstracto de la clase padre
	@Override
	public void dirigir() {
		super.setUrl("educursos.com/" + this.getIdioma() + "/estudiante");
	}

}

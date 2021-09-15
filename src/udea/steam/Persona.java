package udea.steam;

public abstract class Persona {
	
	//Inserte ac� los atributos
    private String id;
    private String nombre;
    private String email;
    private String idioma;
    private String url = "educursos.com";
    
    //Inserte ac� el m�todo constructor
    public Persona(String idP, String nombreP, String emailP, String idiomaP) {
    	this.setId(idP);
    	this.setNombre(nombreP);
    	this.setEmail(emailP);
    	this.setIdioma(idiomaP);
    }

    //Inserte ac� los SETTERS Y GETTERS
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//Inserte ac� el m�todo abstracto
    public abstract void dirigir();

}

package udea;

public class SIMCard {
	// Inserte acá los atributos
	private String empresaTelefonia = "HI";
	private double saldo = 0;
	private String numeroTelefono;
	private boolean celularApagado = true;
	private boolean modoAvionActivado = false;
	private boolean datosActivados = false;
	private int saldoDatos = 0;

	// Inserte acá el método constructor
	public SIMCard(String nTelefono) {
		this.numeroTelefono = nTelefono;
	}

	// Inserte acá los métodos (NO LOS GETTER Y SETTERS)
	public void comprarDatos(int c) {
		double costoDatosTotal = 0;

		if (c <= 10) {
			costoDatosTotal = c * 3000;
		} else if (c > 10 && c <= 30) {
			costoDatosTotal = 30000 + ((c - 10) * 2500);
		} else if (c > 30){
			costoDatosTotal = 60000 + ((c - 20) * 1500);
		}

		if (costoDatosTotal <= this.saldo) {
			this.saldoDatos += c;
			this.saldo -= costoDatosTotal;
		}
	}

	public void consumirDatos(int c) {
		if (!this.celularApagado && !this.modoAvionActivado
				&& this.datosActivados) {
			this.saldoDatos -= c;
		}
	}

	public void llamar(int s) {
		double costoSegundosTotal = 0;

		if (!this.celularApagado && !this.modoAvionActivado) {
			if (s <= 60) {
				costoSegundosTotal = s * 1;
			} else if (s > 60) {
				costoSegundosTotal = 60 + ((s-60) * 0.5);
			}

			this.saldo -= costoSegundosTotal;
		}
	}

	public void recargarSaldo(double s) {
		this.saldo += s;
	}

	public void gestionarEncendidoCelular() {
		if (this.celularApagado) {
			this.celularApagado = false;
		} else {
			this.celularApagado = true;
			this.datosActivados = false;
			this.modoAvionActivado = false;
		}
	}

	public void gestionarModoAvion() {
		if (this.modoAvionActivado) {
			this.modoAvionActivado = false;
		} else {
			if (!this.celularApagado) {
				this.modoAvionActivado = true;
				this.datosActivados = false;
			}
		}
	}

	public void gestionarDatos() {
		if (this.datosActivados) {
			this.datosActivados = false;
		} else {
			if (!this.celularApagado && !this.modoAvionActivado) {
				this.datosActivados = true;
			}
		}
	}

	// Inserte acá los SETTERS Y GETTERS
	public String getEmpresaTelefonia() {
		return empresaTelefonia;
	}

	public void setEmpresaTelefonia(String empresaTelefonia) {
		this.empresaTelefonia = empresaTelefonia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public boolean isCelularApagado() {
		return celularApagado;
	}

	public void setCelularApagado(boolean celularApagado) {
		this.celularApagado = celularApagado;
	}

	public boolean isModoAvionActivado() {
		return modoAvionActivado;
	}

	public void setModoAvionActivado(boolean modoAvionActivado) {
		this.modoAvionActivado = modoAvionActivado;
	}

	public boolean isDatosActivados() {
		return datosActivados;
	}

	public void setDatosActivados(boolean datosActivados) {
		this.datosActivados = datosActivados;
	}

	public int getSaldoDatos() {
		return saldoDatos;
	}

	public void setSaldoDatos(int saldoDatos) {
		this.saldoDatos = saldoDatos;
	}

}
package udea.restaurante;

public class Pedido {

    //Inserte acá los atributos
	private String nPedido;
	private String IDCliente;
	private double costoPedido;
	private int diaPedido;
	private int mesPedido;
	private int yearPedido;

    //Inserte acá el método constructor
	public Pedido(String nPed, String IDCli, double costPed, int diaPed, int mesPed, int yearPed) {
		this.setnPedido(nPed);
		this.setIDCliente(IDCli);
		this.setCostoPedido(costPed);
		this.setDiaPedido(diaPed);
		this.setMesPedido(mesPed);
		this.setYearPedido(yearPed);
	}

    //Inserte acá los SETTERS Y GETTERS
	public String getnPedido() {
		return nPedido;
	}
	public void setnPedido(String nPedido) {
		this.nPedido = nPedido;
	}
	public String getIDCliente() {
		return IDCliente;
	}
	public void setIDCliente(String iDCliente) {
		IDCliente = iDCliente;
	}
	public double getCostoPedido() {
		return costoPedido;
	}
	public void setCostoPedido(double costoPedido) {
		this.costoPedido = costoPedido;
	}
	public int getDiaPedido() {
		return diaPedido;
	}
	public void setDiaPedido(int diaPedido) {
		this.diaPedido = diaPedido;
	}
	public int getMesPedido() {
		return mesPedido;
	}
	public void setMesPedido(int mesPedido) {
		this.mesPedido = mesPedido;
	}
	public int getYearPedido() {
		return yearPedido;
	}
	public void setYearPedido(int yearPedido) {
		this.yearPedido = yearPedido;
	}

}

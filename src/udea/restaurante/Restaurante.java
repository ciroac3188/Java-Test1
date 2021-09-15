package udea.restaurante;
//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;

public class Restaurante {

    //Inserte acá los atributos
	private ArrayList<Pedido> pedidos = new ArrayList<>();

    //Inserte acá el método constructor
	public Restaurante() {
		
	}

    //Inserte acá los SETTERS Y GETTERS
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
	public void agregarPedidoLista(Pedido p) {
		boolean boFound = false;
		ArrayList<Pedido> locPedidos = this.getPedidos();
		
		for (int i = 0; i < locPedidos.size(); i++) {
			if (locPedidos.get(i).getnPedido() == p.getnPedido()) {
				boFound = true;
				break;
			}
		}
		if (boFound == false) {
			locPedidos.add(p);
			this.setPedidos(locPedidos);
		}
	}
	
	public void eliminarPedido(String nPedido) {
		ArrayList<Pedido> locPedidos = this.getPedidos();
		
		for (int i = 0; i < locPedidos.size(); i++) {
			if (locPedidos.get(i).getnPedido() == nPedido) {
				locPedidos.remove(i);
				break;
			}
		}
		this.setPedidos(locPedidos);
	}
	
	public double calcularGanancias() {
		double sumaTotal = 0;
		ArrayList<Pedido> locPedidos = this.getPedidos();
		for (int i = 0; i < locPedidos.size(); i++) {
			sumaTotal += locPedidos.get(i).getCostoPedido();
		}
		return sumaTotal;
	}
	
	public double promedioGananciasTotales() {
		double promedioTotal = 0;
		promedioTotal = this.calcularGanancias()/this.getPedidos().size();
		return promedioTotal;
	}
	
	public double desviacionEstandarGananciasTotales() {
		double mediaTotal, rangoTotal = 0;
		double varianzaTotal = 0;
		ArrayList<Pedido> locPedidos = this.getPedidos();
		
		mediaTotal = this.promedioGananciasTotales();
		for (int i = 0; i < locPedidos.size(); i++) {
			rangoTotal = Math.pow(locPedidos.get(i).getCostoPedido() - mediaTotal, 2);
			varianzaTotal += rangoTotal; 
		}
		varianzaTotal = varianzaTotal/locPedidos.size();
		return Math.sqrt(varianzaTotal);
	}
	
	public double retornarCostoPedido(String ID) {
		double costoPedido = 0;
		ArrayList<Pedido> locPedidos = this.getPedidos();
		
		for (int i = 0; i < locPedidos.size(); i++) {
			if (locPedidos.get(i).getnPedido() == ID) {
				costoPedido = locPedidos.get(i).getCostoPedido();
				break;
			}
		}
		return costoPedido;
	}

}

package udea.restaurante;

public class PruebaRestaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante miRest = new Restaurante();
		Pedido miPed = new Pedido("001","1", 1000.0, 1, 1, 2021);
		miRest.agregarPedidoLista(miPed);
		miPed = new Pedido("002","2", 2000.0, 1, 1, 2021);
		miRest.agregarPedidoLista(miPed);
		miPed = new Pedido("003","3", 3000.0, 1, 1, 2021);
		miRest.agregarPedidoLista(miPed);
		System.out.println(miRest.calcularGanancias());
		System.out.println(miRest.promedioGananciasTotales());
		System.out.println(miRest.desviacionEstandarGananciasTotales());
		System.out.println("Fin");
	}

}

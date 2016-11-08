package edu.udc.is.test.almacen;

public class TestCuentas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prestamo prestamo = new PrestamoInteresDirecto( 12000, 0.35, 12);
		prestamo.calcularPlan();
		double recupero = 0.0;
		for (Cuota cuota: prestamo.getCuotas()){
			System.out.println(cuota.getNumero() +  " " + cuota.getCapital());
			recupero += cuota.getCapital();
		}
		
		System.out.println(recupero  + " " + prestamo.getCapital());
		
		
	}
}

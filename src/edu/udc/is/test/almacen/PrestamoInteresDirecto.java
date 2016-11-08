package edu.udc.is.test.almacen;

public class PrestamoInteresDirecto extends Prestamo {
	
	
	
	public PrestamoInteresDirecto(double capital, double interesAnual,
			int cantidadCuotas) {
		super(capital, interesAnual, cantidadCuotas);
	}

	@Override
	public void calcularPlan() {
		this.cuotas = new Cuota[this.getCantidadCuotas()];
		double interes = this.getCapital() * this.getInteresAnual() * this.getCantidadCuotas() / 12;
		for (int i = 0;  i < this.cuotas.length ; i++) {
			cuotas[i] = new Cuota(i,  this.getCapital() / this.getCantidadCuotas(), interes);
		}
	}
}

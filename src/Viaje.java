public class Viaje {
	private String ubicacionRecogida;
	private String destino;
	private int duracion;
	private double costo;

	public Viaje(String ubicacionRecogida, String destino, int duracion, double costo) {
		this.ubicacionRecogida = ubicacionRecogida;
		this.destino = destino;
		this.duracion = duracion;
		this.costo = costo;
	}

	public String getUbicacionRecogida() {
		return ubicacionRecogida;
	}

	public void setUbicacionRecogida(String ubicacionRecogida) {
		this.ubicacionRecogida = ubicacionRecogida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
}

public class Solicitud {
	private String ubicacionRecogida;
	private String destino;
	private String tipoUber;

	public Solicitud(String ubicacionRecogida, String destino, String tipoUber) {
		this.ubicacionRecogida = ubicacionRecogida;
		this.destino = destino;
		this.tipoUber = tipoUber;
	}

	public String getUbicacionRecogida() {
		return ubicacionRecogida;
	}

	public String getDestino() {
		return destino;
	}

	public String getTipoUber() {
		return tipoUber;
	}
}

import java.util.ArrayList;

public class Uber {
	private static ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();
	private static ArrayList<Viaje> historialViajes = new ArrayList<Viaje>();

	public static void solicitarUber(Solicitud solicitud) {
		solicitudes.add(solicitud);
	}

	public static void cancelarSolicitud(Solicitud solicitudCancelar) {
		for (int i = 0; i < solicitudes.size(); i++) {
			Solicitud solicitud = solicitudes.get(i);

			if (solicitud.getUbicacionRecogida().equals(solicitudCancelar.getUbicacionRecogida()) &&
					solicitud.getDestino().equals(solicitudCancelar.getDestino()) &&
					solicitud.getTipoUber().equals(solicitudCancelar.getTipoUber())) {
				solicitudes.remove(i);
				break;
			}
		}
	}

	public static void realizarViaje(Solicitud solicitud) {
		String ubicacionRecogida = solicitud.getUbicacionRecogida();
		String destino = solicitud.getDestino();
		int duracion = (int) (Math.random() * 30) + 10; // duración del viaje entre 10 y 40 minutos
		double costo = Math.round(Math.random() * 10000) / 100.0; // costo del viaje entre 0 y 100.00 pesos

		Viaje viaje = new Viaje(ubicacionRecogida, destino, duracion, costo);
		historialViajes.add(viaje);

		System.out.println("¡El viaje ha finalizado! Duración: " + duracion + " minutos. Costo: $" + costo);
	}

	public static void mostrarHistorialViajes() {
		if (historialViajes.isEmpty()) {
			System.out.println("No hay historial de viajes para mostrar.");
		} else {
			System.out.println("Historial de viajes:");

			for (int i = 0; i < historialViajes.size(); i++) {
				Viaje viaje = historialViajes.get(i);
				System.out.println((i+1) + ". " + viaje.getUbicacionRecogida() + " a " + viaje.getDestino() + " - Duración: " + viaje.getDuracion() + " minutos, Costo: $" + viaje.getCosto());
			}
		}
	}

	public static void verificarSolicitudes() {
		for (int i = 0; i < solicitudes.size(); i++) {
			Solicitud solicitud = solicitudes.get(i);

			if (Math.random() < 0.7) { // Probabilidad del 70% de aceptación de la solicitud
				solicitudes.remove(i);
				realizarViaje(solicitud);
			}
		}
	}
}

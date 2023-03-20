import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean salir = false;

		while (!salir) {
			Menu.mostrarMenu();

			Scanner scanner = new Scanner(System.in);
			int opcion = scanner.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("Ingrese la ubicación de recogida:");
					String ubicacionRecogida = scanner.next();

					System.out.println("Ingrese el destino:");
					String destino = scanner.next();

					scanner.next();

					System.out.println("Ingrese el tipo de Uber (Pool, X, XL, Black):");
					String tipoUber = scanner.next();

					scanner.next();

					Solicitud solicitud = new Solicitud(ubicacionRecogida, destino, tipoUber);
					Uber.solicitarUber(solicitud);

					System.out.println("¡Se ha solicitado un Uber!");
					break;
				case 2:
					System.out.println("Ingrese la ubicación de recogida de la solicitud que desea cancelar:");
					String ubicacionRecogidaCancelar = scanner.next();

					scanner.next();

					System.out.println("Ingrese el destino de la solicitud que desea cancelar:");
					String destinoCancelar = scanner.next();

					scanner.next();

					System.out.println("Ingrese el tipo de Uber de la solicitud que desea cancelar (Pool, X, XL, Black):");
					String tipoUberCancelar = scanner.next();

					scanner.next();

					Solicitud solicitudCancelar = new Solicitud(ubicacionRecogidaCancelar, destinoCancelar, tipoUberCancelar);
					Uber.cancelarSolicitud(solicitudCancelar);

					System.out.println("¡Se ha cancelado la solicitud!");
					break;
				case 3:
					Uber.mostrarHistorialViajes();
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("La opción ingresada es inválida. Intente nuevamente.");
					break;
			}
		}
	}

}
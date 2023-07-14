package actividadNro1;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		//Vehiculos
		Vehiculo arauca = new Vehiculo("arauca");
		arauca.setAsientosCuero("no");
		arauca.setClimatizador("si");
		arauca.setColor("Verde");
		mostrarDatos(arauca);
		
		Vehiculo corolla = new Vehiculo("corolla");
		corolla.setAsientosCuero("si");
		corolla.setClimatizador("si");
		corolla.setColor("Gris plomo");
		mostrarDatos(corolla);
		
		Vehiculo twingo = new Vehiculo("twingo");
		twingo.setAsientosCuero("no");
		twingo.setAncho(200);
		twingo.setClimatizador("no");
		mostrarDatos(twingo);
		
		//Camionetas
		Camioneta fortuner = new Camioneta("fortuner");
		fortuner.setPlazasExtras(2);
		fortuner.setPesoPlataforma(900);
		fortuner.setAsientosCuero("si");
		fortuner.setClimatizador("si");
		fortuner.setlargo(2500);
		fortuner.setColor("blanco");
		mostrarDatos(fortuner);
		
		Camioneta tahoe = new Camioneta("tahoe");
		tahoe.setAncho(500);
		tahoe.setlargo(3000);
		tahoe.setPlazasExtras(4);
		tahoe.setAsientosCuero("si");
		tahoe.setClimatizador("si");
		tahoe.setPesoPlataforma(1200);
		tahoe.setColor("negro");
		mostrarDatos(tahoe);
		
		Camioneta explorer = new Camioneta("explorer");
		explorer.setAsientosCuero("si");
		explorer.setClimatizador("si");
		explorer.setColor("azul");
		explorer.setPesoPlataforma(1000);
		explorer.setMotor(2000);
		explorer.setPlazasExtras(2);
		explorer.setlargo(2500);
		mostrarDatos(explorer);
		

	}
	
	//METODO sobrecargado segun el parametro que le pasen
	public static void mostrarDatos(Vehiculo vehiculo) {
		System.out.println("--------------------------------");
		System.out.println("Estos son los datos generales de mi carro "+vehiculo.getMarca()+":");
		System.out.println(vehiculo.getDatosGenerales());
		System.out.println("--------------------------------\n");
	}
	public static void mostrarDatos(Camioneta camioneta) {
		System.out.println("--------------------------------");
		System.out.println("Estos son los datos generales de mi camioneta "+camioneta.getMarca()+":");
		System.out.println(camioneta.getDatosGenerales());
		System.out.println("--------------------------------\n");
	}


}

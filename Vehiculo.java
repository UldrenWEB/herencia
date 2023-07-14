package actividadNro1;

public class Vehiculo {
	
	private int ruedas;  
	private int largo ; 
	private int ancho; 
	private int motor ; 
	private int peso_plataforma ; 
	
	private  String color; 
	private int peso_total; 
	private boolean asientos_cuero, climatizador; 
	private String marca;
	
	
	public Vehiculo(String marca) {
		this.ruedas = 4; 
		this.largo = 2000; 
		this.ancho = 300; 
		this.motor = 1600; 
		this.peso_plataforma = 500; 
		this.marca = marca;
		
	}
	
	
	//Inicio de metodos getters
	public String getMarca() {
		return this.marca;
	}
	
	public int getRuedas() {
		return this.ruedas;
	}
	
	public int getLargo() {
		return this.largo;
	}
	
	public int getMotor() {
		return this.motor;
	}
	public int getAncho() {
		return this.ancho;
	}
	
	public String getDatosGenerales() {
		
		return "La pataforma del vehiculo tiene "+ ruedas+" ruedas"+ 
				", Mide "+ largo/1000 +" metros con un ancho de "+ ancho+
				" cm y un peso de plataforma de "+ peso_plataforma+ " kg"; 
	}
	
	public String getColor() { //Getter
		return "El color del coche es "+ color; 
	}
	
	public String getAsientos() { //GETTER
		
		if(asientos_cuero==true) {
			return "El coche tiene asientos de cuero"; 
		}else {
			return "El coche tiene asientos de serie"; 
		}
	}
	
	public String getClimatizador() {//GETTER
		if(climatizador ==true){
			return "El coche incorpora climatizador"; 
		}else {
			return "El coche lleva aire acondicionado"; 
		}
	}
	
	public String getPeso() {//SETTER Y GETTER 
		
		int peso_carroceria =500; 
		
		peso_total = peso_plataforma+peso_carroceria; 
		
		if(asientos_cuero ==true) {
			peso_total= peso_total+50; 
		}
		
		if(climatizador==true) {
			peso_total= peso_total+20; 
		}
		
		return ""+ peso_total; 
	}
	
	public int getPrecio() { //GETTER
		
		int precio_final = 10000; 
		
		if(asientos_cuero==true) {
			precio_final+=2000; 
		}
		if(climatizador==true) {
			precio_final+=1500; 
		}
		
		return precio_final; 
	}
	//Fin de metodos getters
	
	
	
	//Inicio de metodos setters
		public void setAncho(int ancho) {
			this.ancho = ancho;
		}
		
		public void setlargo(int largo) {
			this.largo = largo;
		}
		
		public void setMotor(int motor) {
			this.motor = motor;
		}
		
		public void setPesoPlataforma(int peso) {
			this.peso_plataforma = peso;
		}
		
		public void setColor (String color_coche) { //SETTER
			
			color = color_coche; 
			
		}
		
		public void setAsientosCuero(String asientos_cuero) {//SETTER
			
			if (asientos_cuero.equalsIgnoreCase("si")) {
				this.asientos_cuero = true; 
			}else {
				this.asientos_cuero = false; 
			}
		}
		
		public void setClimatizador(String climatizador) {//SETTER
			
			if(climatizador.equalsIgnoreCase("si")) {
				this.climatizador =true; 
			}else {
				this.climatizador = false; 
			}
		}
		//Fin de metodos setters 


}


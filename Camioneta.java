package actividadNro1;


public class Camioneta  extends Vehiculo{

	private int plazas_extras; 
	private String marca;
	
	public Camioneta(String marca) {
		
		super(marca); //llamar al constructor de la clase padre 
		this.plazas_extras = 0; 
	}	
	
	public void setPlazasExtras(int plazas_extras) {
		this.plazas_extras = plazas_extras;
	}
	
	public String getDatosCamioneta() {
		return "La plazas extras con las cuenta la camioneta son: "+this.plazas_extras;
	}
	
	//Aqui sobreEscribo el metodo de la clase padre para mostrar las plazas extras que tiene mi camioneta
	@Override
	public String getDatosGenerales() {
		return "La plataforma de la camioneta tiene "+ this.getRuedas()+" ruedas"+ 
				", Mide "+ this.getLargo()/1000 +" metros con un ancho de "+ this.getAncho()+
				" cm y un peso total de la camioneta mas accesorios es de "+ this.getPeso()+ " kg y "
						+this.getDatosCamioneta();
	}
	
	
}  

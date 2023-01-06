package dominio;
import java.io.Serializable;

public class Contacto implements Serializable{
	protected String nombre;
 	protected String telefono;
	public Contacto(String n, String t){
		nombre=n;
		telefono=t;
	}
	public String toString(){
		return "Nommbre: "+nombre+" Telefono: "+telefono;
	}
}


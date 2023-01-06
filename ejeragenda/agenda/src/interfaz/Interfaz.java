package interfaz;
import java.util.Scanner;
import dominio.*;
public class Interfaz{
	public boolean procesarPeticion (String peticion, Libreta l){
		String [] p = peticion.split (" ");
		if (p[0].equals("add"))
			l.add(new Contacto(p[1],p[2]));
		if (p[0].equals("list"));
			System.out.print(l);
		if (p[0].equals("help"))
			System.out.print("introduzca una de las siguientes peticiones: \n add nombre telefono: añadir contacto a la agenda\n list: listar la agenda\n exit: salir");
		if (p[0].equals("exit"))
			return false;
		return true;
	}
	public String leerPeticion(){
		Scanner sc = new Scanner(System.in);
	        System.out.print("Introduccir petición");	
		String cadena = sc.nextLine();
		return cadena;
	}

}

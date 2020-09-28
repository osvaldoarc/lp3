package CarreraDeLeopardos;

public class Animal extends Thread{

	String nombre;
public Animal(int p, String nombre) {
	
	this.nombre = nombre;
	setPriority(p);
}
public void run() {
	for (int i = 0; i < 30; i++) {
		System.out.println(nombre);
		
	}
	System.out.println("\n llega: "+ nombre);
}
}

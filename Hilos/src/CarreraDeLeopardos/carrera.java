package CarreraDeLeopardos;

public class carrera {
	static Animal leopardo1;
	static Animal leopardo2; 
	static Animal leopardo3;
	static Animal leopardo4;

public static void main(String[] args) throws InterruptedException {
	leopardo1 = new Animal(1,"Leopardo1");
	leopardo2 = new Animal(2,"Leopardo2");
	leopardo3 = new Animal(3,"Leopardo3");
	leopardo4 = new Animal(4,"Leopardo4");
	leopardo1.start();
	leopardo2.start();
	leopardo3.start();
	leopardo4.start();
	leopardo1.join();
	leopardo2.join();
	leopardo3.join();
	leopardo4.join();
}
}

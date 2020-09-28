import java.util.Scanner;

public class cubos {

	private static Scanner s;

	public static void main(String[] arg) {
		
		double a,b,c,d,e,f,g,h,i,j;
		double cubo1,cubo2,cubo3,cubo4,cubo5,cubo6,cubo7,cubo8,cubo9,cubo10;
		double suma;
		s = new Scanner(System.in);
		System.out.print("ingrese primer valor: ");
		a = s.nextInt();
		System.out.print("ingrese segundo valor: ");
		b = s.nextInt();
		System.out.print("ingrese tercer valor: ");
		c = s.nextInt();
		System.out.print("ingrese cuarto valor: ");
		d = s.nextInt();
		System.out.print("ingrese quinto valor: ");
		e = s.nextInt();
		System.out.print("ingrese sexto valor: ");
		f = s.nextInt();
		System.out.print("ingrese séptimo valor: ");
		g = s.nextInt();
		System.out.print("ingrese octavo valor: ");
		h = s.nextInt();
		System.out.print("ingrese noveno valor: ");
		i = s.nextInt();
		System.out.print("ingrese décimo valor: ");
		j = s.nextInt();
	
		
		
		cubo1 = a*a*a;
		System.out.println("El valor de a es :\n"+cubo1);
		cubo2 = b*b*b;
		System.out.println("El valor de b es :\n"+cubo2);
		cubo3 = c*c*c;
		System.out.println("El valor de c es :\n"+cubo3);
		cubo4 = d*d*d;
		System.out.println("El valor de d es :\n"+cubo4);
		cubo5 = e*e*e;
		System.out.println("El valor de e es :\n"+cubo5);
		cubo6 = f*f*f;
		System.out.println("El valor de f es :\n"+cubo6);
		cubo7 = g*g*g;
		System.out.println("El valor de g es :\n"+cubo7);
		cubo8 = h*h*h;
		System.out.println("El valor de h es :\n"+cubo8);
		cubo9 = i*i*i;
		System.out.println("El valor de i es :\n"+cubo9);
		cubo10 = j*j*j;
		System.out.println("El valor de j es :\n"+cubo10);
	
		suma = cubo1 + cubo2 + cubo3+ cubo4 + cubo5 + cubo6 + cubo7 + cubo8 + cubo9 + cubo10;
		System.out.println("la suma de cubos es :"+suma);
	}
}

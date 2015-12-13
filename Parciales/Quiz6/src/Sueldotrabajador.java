import java.util.Scanner;

public class Sueldotrabajador {


	private static Scanner teclado;
	private static int sal;
	private static char nom;
	private static char ape;

	public static void main(String[] args) {
		teclado = new Scanner (System.in);
        
		int hora;
		int tarifa = 0;
		int opc = 0;
		
		System.out.println ("Ingrese su nombre y apellido");
		System.out.println(" Cuantas horas laboro ");
		hora = teclado.nextInt();
		
		switch (opc){
		
		case 1: 
			if (hora>=40)
			{
				setSal((int) (tarifa*0.50));
				
				System.out.println(" Su nuevo salario es : ");
			}
				else {
					System.out.println(" Su nuevo salario es : ");
		}
		
	
	}	

	
	}

	public static int getSal() {
		return sal;
	}

	public static void setSal(int sal) {
		Sueldotrabajador.sal = sal;
	}

	public static char getNom() {
		return nom;
	}

	public static void setNom(char nom) {
		Sueldotrabajador.nom = nom;
	}

	public static char getApe() {
		return ape;
	}

	public static void setApe(char ape) {
		Sueldotrabajador.ape = ape;
	}
	
}
		



import java.util.Scanner;


public class Lata {
	
	
	private static double altura;
	private static double diametro;
	private static double vol;
	private static double sup;

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int pi=(int) 3.14;
		int r = 0;
		int a = 0;
		System.out.println("************Calcular volumen y superficie de 3 objetos************** ");
		 
		vol=(pi*r*r*a);  
        sup=(2*pi)*(r*r)+(2*pi)*(r*a);
		
		System.out.println("Ingrese radio: ");
		System.out.println("Ingrese altura: ");
          
     
    }

	public static double getAltura() {
		return altura;
	}

	public static void setAltura(double altura) {
		Lata.altura = altura;
	}

	public static double getDiametro() {
		return diametro;
	}

	public static void setDiametro(double diametro) {
		Lata.diametro = diametro;
		
		
	}

	public static double getVol() {
		return vol;
	}

	public static void setVol(double vol) {
		Lata.vol = vol;
	}

	public static double getSup() {
		return sup;
	}

	public static void setSup(double sup) {
		Lata.sup = sup;
	}    

}
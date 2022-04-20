import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ladoQuadrado;
		double raioCirculo;
		
		double perimetroQuadrado;
		double areaQuadrado;
		
		double perimetroCirculo;
		double areaCirculo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o lado do quadrado?");
		ladoQuadrado = sc.nextDouble();
		
		System.out.println("Qual o raio do circulo?");
		raioCirculo = sc.nextDouble();
		
		perimetroQuadrado = 4 * ladoQuadrado;
		areaQuadrado = ladoQuadrado * ladoQuadrado;
		
		perimetroCirculo = 2 * Math.PI * raioCirculo;
		areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
		
		System.out.println("perimetroQuadrado = " + perimetroQuadrado);
		System.out.println("areaQuadrado = " + areaQuadrado);
		System.out.println("perimetroCirculo = " + perimetroCirculo);
		System.out.println("areaCirculo = " + areaCirculo);
		
	}

}

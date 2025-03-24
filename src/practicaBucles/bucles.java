package practicaBucles;

public class bucles {
	public static void main(String[] args) {
		System.out.printf("Bucle for%n");
		System.out.printf("---------%n");
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		System.out.printf("%nBucle while%n");
		System.out.printf("-----------%n");
		
		int numeroMaximo = 0;
		while(++numeroMaximo <= 10) {
			System.out.printf("%d ", numeroMaximo);
		}
		
		System.out.println();
		System.out.printf("%nBucle do while%n");
		System.out.printf("--------------%n");
		
		int contador = 0;

		do{
			contador++;
			System.out.printf("%d ", contador);
		}while (contador < 10);
		
		
	}
}

package Dia2;
/*Receber 3 d�gitos e em seguida expor qual o n�mero mais alto*/
	import java.util.Scanner;
public class ExercicioUm
{
	public static void main (String args[])
	{
		
	int a;
	int b;
	int c;
	int maior=0;
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Digite o primeiro n�mero: ");
	a = input.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	b = input.nextInt();
	System.out.println("Digite o terceiro n�mero: ");
	c = input.nextInt();
			
			if (a>b && a>c) {
				maior = a;
			}
			else if (b>a && b>c) {
				maior = b;
			}
			else if (c>b && c>a) {
				maior = c;
			}
		System.out.printf("O maior n�mero �: %d\n: ", maior);
	}
}


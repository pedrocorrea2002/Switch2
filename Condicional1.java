import java.util.Scanner;


public class Condicional1 {
	public static void main(String[] args){
		
		int numero=0;

		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite um número");
		{while(numero == 0){	
			try{
			 numero = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		if ((numero<90)&&(numero>20)){
			System.out.println(numero+" está entre 20 e 90");
		}
		else{ 
			System.out.println(numero+" não está entre 20 e 90");
			
	}}}}	
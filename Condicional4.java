import java.util.Scanner;


public class Condicional4 {
	public static void main(String[] args){
		
		int lado1=0,lado2=0,lado3=0;

		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite a medida dos 3 lados do tri�ngulo");
		System.out.println("Lado 1:");
		{while(lado1 == 0){	
			try{
			 lado1 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		System.out.println("Lado 2:");
		{while(lado2 == 0){	
			try{
			 lado2 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		System.out.println("Lado 3:");
		{while(lado3 == 0){	
			try{
			 lado3 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		
		if ((lado1==lado2)&&(lado2==lado3)){
			System.out.println("Tri�ngulo Equil�tero");
   
        } else if(((lado1==lado2)&&(lado2!=lado3))|((lado2==lado3)&&(lado1!=lado2))|((lado1==lado3)&&(lado2!=lado3))){
        	System.out.println("Tri�ngulo Is�sceles");
        	
        } else if((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3)){
        	System.out.println("Tri�ngulo Escaleno");
            
}}}}}}	
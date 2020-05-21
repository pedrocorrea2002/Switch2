import java.util.Scanner;


public class Condicional2 {
	public static void main(String[] args){
		
		int idade=0;

		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador");
		{while(idade == 0){	
			try{
			 idade = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		if ((idade >= 5 ) && (idade <= 10)) {
			System.out.println("CATEGORIA: Infantil");
   
        } else if((idade >= 11) && (idade <= 17)){
        	System.out.println("CATEGORIA: Juvenil");
        	
        } else if(idade >= 18){
        	System.out.println("CATEGORIA: Adulto");
           
        } else {
        	System.out.println("IDADE IMPRÓPRIA PARA A ATIVIDADE");
            
}}}}	
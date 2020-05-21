import java.text.DecimalFormat;
import java.util.Scanner;


public class Condicional3 {
	public static void main(String[] args){
		
		double salario=0;

		Scanner code = new Scanner(System.in);
		DecimalFormat df =  new DecimalFormat("0.00");
		
		System.out.println("Digite seu salário");
		{while(salario == 0){	
			try{
			 salario = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
		if ((salario >= 1 ) && (salario <= 1000)) {
			System.out.println("SALÁRIO ATUAL:"+df.format(salario*1.15)+" com o aumento de 15%");
   
        } else if((salario > 1000) && (salario <= 2500)){
        	System.out.println("SALÁRIO ATUAL:"+df.format(salario*1.07)+" com o aumento de 7%");
        	
        } else if(salario > 2500){
        	System.out.println("SALÁRIO ATUAL: R$"+df.format(salario)+" sem nenhum aumento");
            
}}}}	
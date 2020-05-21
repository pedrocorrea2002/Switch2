import java.util.Scanner;


public class Condicional5 {
	public static void main(String[] args){
		
		double nota1=0,nota2=0,nota3=0,nota4=0;

		Scanner code = new Scanner(System.in);
		
		System.out.println("Digite nota do aluno no primeiro bimestre");
		{while(nota1 == 0){	
			try{
			 nota1 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		System.out.println("Digite nota do aluno no segundo bimestre");
		{while(nota2 == 0){	
			try{
			 nota2 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		System.out.println("Digite nota do aluno no terceiro bimestre");
		{while(nota3 == 0){	
			try{
			 nota3 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		System.out.println("Digite nota do aluno no quarto bimestre");
		{while(nota4 == 0){	
			try{
			 nota4 = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		double media=((nota1+nota2+nota3+nota4)/4);
		
		if (media>=7){
			System.out.println("Aprovado");
   
        } else if((media>=3.5)&(media<=7)){
        	System.out.println("Recuperação");
        	
        } else if(media<3.5){
        	System.out.println("Reprovado");
            
}}}}}}}	
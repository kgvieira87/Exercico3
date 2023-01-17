import java.util.Scanner;


public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
	
	

int produto;
int x = 1 ;

System.out.println("Informe o múltiplo da tabuada:");	
produto = sc.nextInt();


while (x <=10 ){
	
	System.out.println(x + " x "+ produto + " = " + x*produto);	
	x ++;
	
}
		
		
	}

}

import java.util.Scanner;


public class NumPrimos {

	public static void main(String[] args) {
		
		Scanner numeroIng= new Scanner(System.in);//Permite capturar el valor ingresado por el usuario
		
		
		System.out.print("Ingreso el Numero ");
		 
		int numero = numeroIng.nextInt();//Guarda el Numero Ing. 
		int suma = 0;
		
		for (int i =1; i<=numero; i++ ) {
			
		  //Declaro variable para conocer si el residuo es = 0
		    int conteo = numero%i;
		    if (conteo== 0 ) { 
				//Si del listado de numeros es=0; va a sumar a la variable suma 
				suma = suma+1;
				
			}
		}
		
		//Verifica si mi suma es menor igual que 2
		 if (suma <=2) {
			 System.out.print("EL NUMERO ES PRIMO");
	  		 
		 }else 
			 System.out.print("EL NUMERO NO ES PRIMO");
	
		 
	}
	
}

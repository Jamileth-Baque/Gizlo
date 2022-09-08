import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        //Ingreso del numero para saber si esta dentro de la secuencia FIBONACCI 
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese numero");
        Integer numero= ingreso.nextInt();
        // Se instancia variables para el calculo
        int a=0, b=1,c;
        boolean resul=false;
        //Se inicia el For para recorrer dentro de la secuencia
        for(int i=1; i<(numero*2); i++){
            c=a+b;
            a=b;
            b=c;
            //Se valida si el numero es FIBONACCI, en caso de ser correcto retorna TRUE.
            if(numero==a){
                resul=true;
            }
        }
        // Si retorna TRUE devuelve el resultado  
        if(resul){
            System.out.println("Es Fibonacci");
        }else{
            System.out.println("No Es Fibonacci");
        }
        
        
    }
    
    
}



package pruebaexcepcion;


public class PruebaExcepcion {

    
public static void main(String args[]){
formatoNumero();
desborde();
aritmetico();
}   


    //excepción tratada
public static void formatoNumero(){
 
 int numero;   
 String cadena="  1";   
 	try{   
    		numero = Integer.parseInt(cadena);   
 	}   
 catch(NumberFormatException ex){   
 System.out.println("No es un número, es una cadena de texto."+ex.getMessage());   
    
}   
}
public static void desborde(){
 
try{ 
 int v[]= new int[3];  
 
 
    for(int i =0; i<5;i++){
    v[i]=i;
    }                  
} 
 catch(ArrayIndexOutOfBoundsException v){
     System.out.println("El tamaño del vector en menor a 3");
}

}
public static void aritmetico(){
 
int numero=5, resultado;

try{
resultado= numero/0;

}catch(ArithmeticException nu){
    System.out.println("No se puede dividir por 0");
}														                  
}

}
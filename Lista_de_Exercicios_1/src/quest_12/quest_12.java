/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_12;

import java.util.Scanner;

public class quest_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);    
        
        int numero, elemesmo=0, resto, contador=0;    
             
        System.out.println("Digite um Número: ");    
        numero = teclado.nextInt();    
             
         while ( numero >= elemesmo){  
            ++elemesmo;  
                
            resto = numero % elemesmo;   
                
            if ( resto == 0) {  
            	contador++;  
             }              
          }  
          if ( contador <= 2) {  
             System.out.println("O Número "+numero+" é primo");  
          }  
          else {  
             System.out.println("Número "+numero+" não é primo");  
          }        
          
          teclado.close();
		}   
             
     } 

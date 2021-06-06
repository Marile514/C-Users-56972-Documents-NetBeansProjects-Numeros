/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author 56972
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12, b = 24, c = 9, d = 0, e = 33;
        int suma, resta, multi;
        double division;
        
        //Operadores.
        suma = a+b+c+d;
        resta = a-b-c-d-e;
        multi = a*d;
        division = e/c;
        
        //Respuestas:
        if(suma == 0){
            System.out.println("La operación será negada");
        }else{
            if(resta == 0){
                System.out.println("La operación es negada");
            }else{
                if(multi == 0){
                   System.out.println("La operación es negada"); 
                }else{
                    if(division == 0){
                        System.out.println("La operación es negada");
                    }else{
                        System.out.println("Los operadores exitosos.");
                    }
                }
            }
        }
    }
    
}

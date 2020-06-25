/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author camila
 */
public class Generales {
    
    
    public boolean verificarRut(int rut, String digito){
        String digitoCorrecto= "";
         if(rut != 0){
            int contador;
            contador=2;
            int Acumulador=0;
            int resto=0;
            int multiplicacion;
            int resta;
            while (rut!=0){
                int Multiplo=(rut%10)*contador;
                Acumulador=Acumulador+Multiplo;
                rut=rut/10;
                contador++;
                if(contador==8){
                contador=2;
                }
                
            }
            resto = (Acumulador / 11) ;
            multiplicacion = resto * 11;
            resta = Math.abs(Acumulador - multiplicacion);
            digitoCorrecto = String.valueOf(11- resta);
            if(digitoCorrecto.equals("10")){
                digitoCorrecto="K";
            }
            if(digitoCorrecto.equals("11")){
                digitoCorrecto="0";
            }
            boolean rutCorrecto= false;
                
            if(digitoCorrecto.equalsIgnoreCase(digito)){
                rutCorrecto=true;
                return rutCorrecto;  
            }
               
        }
         
       return false;
    }
}

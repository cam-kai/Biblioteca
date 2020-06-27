/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.ArrayList;

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
    
    public ArrayList<String> validacionesDistribuidor( String rut, String dV, String nombre, String anios, String direccion, String telefono, String correo){
        ArrayList<String> errores = new ArrayList<>();
        String error = "";
        
        if(rut.isBlank() == true){
            error = "Debe ingresar un rut";
            errores.add(error);
        }else if(rut.matches("[0-9]+")== false){
            error = "El rut debe contener solo numeros";
            errores.add(error);
        }else if(dV.isBlank()== true){
            error = "Debe ingresar un caracter";
            errores.add(error);
        }else if(dV.matches("[0-9]+")==false && dV.contains("k")== false && dV.contains("K")==false){
            error = "El digito verificador es invalido";
            errores.add(error);
        }else if(nombre.isBlank() == true){
            error = "Debe ingresar un nombre de empresa";
            errores.add(error);
        }else if(anios.isBlank() == true){
            error = "Debe ingresar los años de servicio";
            errores.add(error);
        }else if(anios.matches("[0-9]+")== false){
            error = "Los años de servicio tienen que ser numericos";
            errores.add(error);
        }else if(direccion.isBlank()== true){
            error = "Debe ingresar una direccion";
            errores.add(error);
        }else if(telefono.isBlank()== true){
            error = "Debe ingresar un telefono de contacto";
            errores.add(error);
        }else if(telefono.matches("[0-9]+")== false){
            error = "El telefono debe contener solo numeros";
            errores.add(error);
        }else if(correo.isBlank()== true){
            error = "Debe ingresar un correo";
            errores.add(error);
        }else if(correo.contains("@")== false && correo.indexOf(".")>0){
            error = "Debe ingresar un correo valido";
            errores.add(error);
        }
        
        return errores;
    }
}

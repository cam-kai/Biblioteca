/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author camila
 */




public class Generales {
    
    
     public static boolean isBlank2(String datos) {
        if(datos.trim().length() == 0) {
            return true;
        }
        
        return false;
    }
    
    public boolean isBlank(String datos) {
        if(datos.trim().length() == 0) {
            return true;
        }
        
        return false;
    }
    
    
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
        
        if(isBlank(rut)){
            error = "Debe ingresar un rut";
            errores.add(error);
        }else if(rut.matches("[0-9]+")== false){
            error = "El rut debe contener solo numeros";
            errores.add(error);
        }
        if(isBlank(dV)){
            error = "Debe ingresar un caracter";
            errores.add(error);
        }else if(dV.matches("[0-9]+")==false && dV.contains("k")== false && dV.contains("K")==false){
            error = "El digito verificador es invalido";
            errores.add(error);
        }else if(dV.length()>1){
            error = "El digito verificador debe contener un solo caracter";
            errores.add(error);
        }
        if(isBlank(nombre)){
            error = "Debe ingresar un nombre de empresa";
            errores.add(error);
        }
        if(isBlank(anios)){
            error = "Debe ingresar los años de servicio";
            errores.add(error);
        }else if(anios.matches("[0-9]+")== false){
            error = "Los años de servicio tienen que ser numericos";
            errores.add(error);
        }
        if(isBlank(direccion)){
            error = "Debe ingresar una direccion";
            errores.add(error);
        }
        if(isBlank(telefono)){
            error = "Debe ingresar un telefono de contacto";
            errores.add(error);
        }
        if(telefono.matches("[0-9]+")== false){
            error = "El telefono debe contener solo numeros";
            errores.add(error);
        }
        if(isBlank(correo)){
            error = "Debe ingresar un correo";
            errores.add(error);
        }
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matC = pat.matcher(correo);
        if( matC.find()== true){
            System.out.println("es valido");
        }else{
            System.out.println("No es valido");
            error = "Debe ingresar un correo valido";
            errores.add(error);
        }
        return errores;
    }
    
    public ArrayList<String> validacionesClienteTrabajador( String fecha, String rut, String dV, String nombre, String apellidoP , String apellidoM , String direccion , String correo , String telefono){
        ArrayList<String> errores = new ArrayList<>();
        String error ="";
        
        if(isBlank(fecha)){
            error = "Debe ingresar una fecha";
            errores.add(error);
        }else if(fecha.length()>10 == true){
            error = "La fecha solo puede contener 10 caracteres";
            errores.add(error);
        }
        // 29 f = ^(29/02/(2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))))$
        // feb = ^((0[1-9]|1[0-9]|2[0-8])/02/((19|2[0-9])[0-9]{2}))$
        // 31 d = ^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|2[0-9])[0-9]{2}))$
        // 30 d = ^((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|2[0-9])[0-9]{2}))$
        
        Pattern patt = Pattern.compile( "^(29\\/02\\/(2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))))$"
                                        +"|^((0[1-9]|1[0-9]|2[0-8])\\/02\\/((19|2[0-9])[0-9]{2}))$"
                                        +"|^((0[1-9]|[12][0-9]|3[01])\\/(0[13578]|10|12)\\/((19|2[0-9])[0-9]{2}))$"
                                        +"|^((0[1-9]|[12][0-9]|30)\\/(0[469]|11)\\/((19|2[0-9])[0-9]{2}))$");     
        
        Matcher matF = patt.matcher(fecha);
        if(matF.find()==false){
            error = "La fecha debe tener el siguiente formato : dia/mes/año ";
            errores.add(error);
        }
        if(isBlank(rut)){
            error = "Debe ingresar un rut";
            errores.add(error);
        }else if(rut.matches("[0-9]+")== false){
            error = "El rut debe contener solo numeros";
            errores.add(error);
        }
        if(isBlank(dV)){
            error = "Debe ingresar un digito verificador";
            errores.add(error);
        }else if(dV.matches("[0-9]+")== false && dV.contains("k")== false && dV.contains("K")== false){
            error = "El digito verificador debe ser entre 0 y 9 ó k ";
            errores.add(error);
        }else if(dV.length()>1){
            error = "El digito verificador admite un caracter";
            errores.add(error);
        }
        if(isBlank(nombre)){
            error = "Debe ingresar un nombre";
            errores.add(error);
        }else if(nombre.matches("[0-9]+")== true){
            error = "El nombre no puede contener numeros";
            errores.add(error);
        }
        if(isBlank(apellidoP)){
            error = "Debe ingresar un apellido";
            errores.add(error);
        }else if(apellidoP.matches("[0-9]+")== true){
            error = "El apellido no puede contener numeros";
            errores.add(error);
        }
        if(apellidoM.matches("[0-9]+")== true){
            error = "El apellido no puede contener numeros";
            errores.add(error);
        }
        if(isBlank(direccion)){
            error = "Debe ingresar una direccion";
            errores.add(error);
        }
        if(isBlank(correo)){
            error = "Debe ingresar un correo electronico";
            errores.add(error);
        }
        
        Pattern pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matC = pat.matcher(correo);
        if( matC.find()== true){
            System.out.println("es valido");
        }else{
            System.out.println("No es valido");
            error = "Debe ingresar un correo valido";
            errores.add(error);
        }
        if(isBlank(telefono)){
            error = "Debe ingresar un telefono";
            errores.add(error);
        }else if(telefono.matches("[0-9]+")== false){
            error = "El telefono solo debe contener numeros";
            errores.add(error);
        }
        
        return errores;
    }
}

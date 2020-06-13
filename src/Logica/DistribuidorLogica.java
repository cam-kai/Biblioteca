/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import DAO.DistribuidorDAO;
import Entidades.Distribuidores;

/**
 *
 * @author camila
 */
public class DistribuidorLogica {
    
    public String agregarDistribuidor(Distribuidores distribuidor){
       
        boolean fueAgregado= false ;
        
        if(distribuidor.getNombreEmpresa().equals("")){
            return "Ingrese nombre de la empresa";
        }else{
            fueAgregado = new DistribuidorDAO().agregarDistribuidor(distribuidor);
            
            if(fueAgregado=true){
                return "El distribuidor fue agregado correctamente";
                
            }else{
                return "El distribuidor no ha podido ser agregado";
            }
                
        }
        
    }
    
    public String actualizarDistribuidor(Distribuidores distribuidor){
        boolean fueActualizado= false;
        
        fueActualizado= new DistribuidorDAO().actualizarDistribuidores(distribuidor);
        
        if(fueActualizado= true){
            return "El distribuidor fue modificado correctamente";
        }else{
            return "El distribuidor no ha podido ser modificado";
        }
              
    }
    
}

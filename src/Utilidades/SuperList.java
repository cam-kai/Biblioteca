/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author camila
 */
public class SuperList<T> extends ArrayList<T> {
    public String[] getArray(){
        String[] arreglo = new String[this.size()];
        int i=0;
        Iterator itor = this.iterator();
        
        while(itor.hasNext()){
            Object obj = itor.next();
            arreglo[i]= ((IStringConvertible)obj).getDataField();
            i++;
        }
        return arreglo;
    }
}

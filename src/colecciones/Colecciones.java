/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author educacionit
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*List<String> nombres=new ArrayList<>();
       nombres.add("Juan");
       nombres.add("fecha");
       nombres.add("Juan");
       
       System.out.println(nombres.size());
       
       System.out.println(nombres.get(0));
        
       nombres.remove(0);
        for(String e:nombres){
            System.out.println(e);*/
       
       Set<Persona> personas=new HashSet<>();
       personas.add(new Persona ("Juan","10"));
       personas.add(new Persona("Juan","13"));
       personas.add(new Persona("Pedro","14"));
       
       
       System.out.println(personas.size());
       
       for(Persona p:personas){
           System.out.println(p);
       }
       
           
       }
    
    
    }
    


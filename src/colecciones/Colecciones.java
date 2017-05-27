/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


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
       
      /* Set<Persona> personas=new HashSet<>();
       personas.add(new Persona ("Juan","10"));
       personas.add(new Persona("Juan","13"));
       personas.add(new Persona("Pedro","14"));
       
       
       System.out.println(personas.size());
       
       for(Persona p:personas){
           System.out.println(p);*/
      
      /*SortedSet<Persona> personas=new TreeSet<Persona>();
        personas.add(new Persona("Juan","142"));
        personas.add(new Persona("Pedro","345"));
        personas.add(new Persona("Alvaro","220"));
        personas.add(new Persona("walter","96"));
       
      for (Persona p: personas){
          System.out.println(p);
      }*/
      
      Map<String,Persona> personasPorDni=new HashMap<>();
       personasPorDni.put( "110",new Persona("Juan","110"));
       
       Persona p2=new Persona("Pedro","220");
       personasPorDni.put(p2.getDni(),p2);
       personasPorDni.put("110",p2);
       Persona x= personasPorDni.get("220");
       //values()
      for(Persona p:personasPorDni.values()){
          System.out.println(p);
        
    }
      //keySet()
    /* for(String k:personasPorDni.keySet()){
          System.out.println(k +":"+ personasPorDni.get(k) );
      }*/
      
     //EntySet
     for(Map.Entry<String,Persona> e: personasPorDni.entrySet()){
     System.out.println(e.getKey()+":"+ e.getValue());
         
     }
     //para remover(personasPorDni.remove("220"),
     //para agregar (personasPorDni.putifAbsent("40",p2));
     personasPorDni.containsKey("220");
     personasPorDni.containsKey(p2);
     Persona x1 = personasPorDni.getOrDefault("30",x);
    }
    
}
           
       
    
    
    
    


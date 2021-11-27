
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Julio López
 */

interface AnonClass{
    
    public void anonMethod();
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<String>(); 
        miLista.add("Computación");
        miLista.add("En");
        miLista.add("Java");
        miLista.add("Julio");
        miLista.add("Armando");
        miLista.add("López");
        miLista.add("Castillo");
        miLista.add("ICA");
        miLista.add("Tecmilenio");
        miLista.add("CampusGPE");
        
        AnonClass anon = new AnonClass() {
            @Override
            public void anonMethod() {
                System.out.println("---------------Ordenado por longitud---------------");
                miLista.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
                for(String vald:miLista){
                    System.out.println(vald); 
                }
                    
                System.out.println("------------Ordenado por orden alfabetico------------");
                Collections.sort(miLista);
                for (String n : miLista) {
                     System.out.println(n);                                                                                       
                } 
            }
        };

        anon.anonMethod();
    }
    
}

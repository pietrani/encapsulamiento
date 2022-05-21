/*
/*

Generar una clase Vehiculos como clase padre 
cantidadKm
Marca

metodos principales->get set const y toString
metodoMostrarCantKM
MENSJAE QUE DIGA
"LA CANTIDAD DE KM QUE RECORRIO ES DE:"+KM

la misma va constar de dos clases hijas 
autos y motos

autos->tienen el campo motor

motos->tiene como extra el campo cilindrada

Construir un main en donde creemos una moto y un auto para luego mostrar 
los datos completos de cada una 
y para una moto y un auto (no ambas motos o autos) mostrrar la cantidad KM

*/

package Org.Proydesa;

import Clases.Autos;
import Clases.Motos;
import java.util.Scanner;


public class TestVehiculos {
    
    public static void main(String[] args) {
        
        
      Autos a1 =new Autos(0,0,"");
      
     a1.setMarca(cargaTexto("ingrese la marca del Automovil"));
     a1.setCantkm(cargarNumero("ingrese la cantidad de kms"));
     a1.setMotor(cargarNumero("ingrese el tipo de motor"));
        
            
           System.out.println(a1.toString()); 
            
      Motos m1=new Motos(0,0,"");
      m1.setMarca(cargaTexto("ingrese la marca de la moto "));
     m1.setCantkm(cargarNumero("ingrese la cantidad de kms"));
     m1.setCilindrada(cargarNumero("ingrese la cilindrada"));
          
          System.out.println(m1.toString());
          
        }
                
                
                
        
        
        
    public static int cargarNumero(String texto){
    
    
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        int  numero=sn.nextInt();
        return numero;
    }
    
    public static String cargaTexto(String texto){
        
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        String nombre=sn.nextLine();
        
        return nombre;
    }
   
        
        
        
        
        
   
}

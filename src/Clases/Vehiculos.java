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
package Clases;


 class Vehiculos {
    
    
    private int cantkm;
    private String marca;

    public int getCantkm() {
        return cantkm;
    }

    public void setCantkm(int cantkm) {
        this.cantkm = cantkm;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculos(int cantkm, String marca) {
        this.cantkm = cantkm;
        this.marca = marca;
    }
    public void MostrarCantKm(){
        
        System.out.println("LA CANTIDAD DE KM QUE RECORRIO ES DE:" +this.cantkm);
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "cantkm=" + cantkm + ", marca=" + marca + '}';
    }

    
        
        
    
    
   
  
       
       
  
    
    
    
    
}//fin de la Clase


package Clases;


public class Motos extends Vehiculos{
    
   private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motos(int cilindrada, int cantkm, String marca) {
        super(cantkm, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motos{"+ super.toString() + "cilindrada=" + cilindrada + '}';
    }

  
    public void mostrarkmMoto(){
        System.out.println("LA CANTIDAD DE KM QUE RECORRIO ES DE:"+ this.getCantkm());
    }

   
}
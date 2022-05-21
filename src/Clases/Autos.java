
package Clases;


 
public class Autos extends Vehiculos {
    
    private int motor;

    

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public Autos(int motor, int cantkm, String marca) {
        super(cantkm, marca);
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Autos{"+ super.toString() + "motor=" + motor + '}';
    }

   
}

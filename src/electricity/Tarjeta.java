
package electricity;

import java.util.Random;


public class Tarjeta extends Electrodomestico {
    Random random = new Random();
    public Tarjeta() {
        
    }
         
    
    @Override
    public void generarconsumo(){
        consumowatts=random.nextInt(70 + 20) + 20;
    }
}

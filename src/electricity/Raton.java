
package electricity;

import java.util.Random;


public class Raton extends Electrodomestico {
    Random random = new Random();
    public Raton() {
        
    }
         
    
    @Override
    public void generarconsumo(){
        consumowatts=random.nextInt(40 + 10) + 10;
    }
}

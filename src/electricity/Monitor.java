
package electricity;

import java.util.Random;


public class Monitor extends Electrodomestico{

    Random random = new Random();
    public Monitor() {
        
    }
         
    
    @Override
    public void generarconsumo(){
        consumowatts=random.nextInt(250 + 50) + 50;
    }
    
}

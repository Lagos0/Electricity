
package electricity;

import java.util.Random;


public class Procesador extends Electrodomestico {
    Random random = new Random();
    public Procesador() {
        
    }
         
    
    @Override
    public void generarconsumo(){
        consumowatts=random.nextInt(70 + 20) + 20;
    }
}

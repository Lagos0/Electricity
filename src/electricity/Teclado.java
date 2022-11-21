
package electricity;

import java.util.Random;


public class Teclado extends Electrodomestico{
     Random random = new Random();
    public Teclado() {
        
    }
         
    
    @Override
    public void generarconsumo(){
        consumowatts=random.nextInt(70 + 20) + 20;
    }
}


package electricity;


public abstract class Electrodomestico {
    int consumowatts;
    double costohora=2;
    double consumototal;

    public int getConsumowatts() {
        return consumowatts;
    }

    public void setConsumowatts(int consumowatts) {
        this.consumowatts = consumowatts;
    }

    public double getCostohora() {
        return costohora;
    }

    public void setCostohora(double costohora) {
        this.costohora = costohora;
    }

    public double getConsumototal() {
        return consumototal;
    }

    public void setConsumototal(double consumototal) {
        this.consumototal = consumototal;
    }

    
    
    
    
    public double calcularconsumototal(){
         consumototal=consumowatts*costohora;
         return consumototal;
    }
    
    public abstract void generarconsumo();
}

package cars;


public class Truck extends Vehicle {
    private int numberOfAxles;
    private double capacityInTons;
    
    
    
    public void setNumberOfAxles(int NOS) {
        this.numberOfAxles = NOS;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }
    public void setCapacityInTons(int CIT) {
        this.numberOfAxles = CIT;
    }

    public double getCapacityInTons() {
        return capacityInTons;
    }
    
    
    public void load(double weight) {
        System.out.println("Truck Loaded " + weight + " tons.");
    }

   

}

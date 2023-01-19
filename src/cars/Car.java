package cars;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void setNumberOfDoors(int NOD) {
        this.numberOfDoors = NOD;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void openTrunk() {
        System.out.println("Trunk opened");
    }

   
    
}

package cars;

public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;
    private double chargeLevel;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(double chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public void charge() {
        chargeLevel += 10;
        System.out.println("Battery charging, charge level at: " + chargeLevel + "%");
        if (chargeLevel==100.0)
        {
        	System.out.println(" Batttery full chrged ");
        }
    }

    //override
    public void drive(int miles) {
        System.out.println("Electric vehicle driven " + miles + " miles.");
    }
}
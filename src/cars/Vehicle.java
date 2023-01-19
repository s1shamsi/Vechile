package cars;


	
	public class Vehicle {
	    private String make;
	    private String model;
	    private int year;
	    private String color;
	    private int numberOfWheels;
	    private double weight;

	    public String getMake() {
	        return make;
	    }

	    public void setMake(String make) {
	        this.make = make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getNumberOfWheels() {
	        return numberOfWheels;
	    }

	    public void setNumberOfWheels(int numberOfWheels) {
	        this.numberOfWheels = numberOfWheels;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }

	    public static void start() {
	        System.out.println("Vehicle started.");
	    }

	    public static void stop() {
	        System.out.println("Vehicle stopped.");
	    }

	    public void drive(int miles) {
	        System.out.println("Vehicle driven " + miles + " miles.");
	    }

	    public static void honk() {
	        System.out.println("Honk Honk!");
	    }
	    


	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	    	 System.out.println("<><><><><><><> Vehicle <><><<><><><><><>");
			start(); 
			honk(); 
		
			stop();
			System.out.println(" ");
            System.out.println("<><><><><><><><> Car <><<><><><><><>");
            System.out.println(" ");
            
			Car car = new Car();
			car.start();
			car.openTrunk(); 
			car.stop();
            System.out.println(" ");
            System.out.println("<><><><><><><><> Truck <><<><><><><><>");
            System.out.println(" ");
            
            Truck truck = new Truck();
            truck.start();
			truck.load(12.5); 
			truck.stop();
			
			System.out.println(" ");
            System.out.println("<><><><><><><> Electrical Vechicle <><><<><><><><><>");
            System.out.println(" ");
            
			ElectricVehicle electricVehicle = new ElectricVehicle();
			electricVehicle.start();
			for (int i = 0 ; i< 10 ; i++)
			{
			electricVehicle.charge();
			}
			electricVehicle.drive(50);
			electricVehicle.stop();
			System.out.println(" ");
            System.out.println("<><><><><><><><><><<><><><><><><><><><><><><><><><<><><><><><>");
            System.out.println(" ");
			
		}
	}

	


	



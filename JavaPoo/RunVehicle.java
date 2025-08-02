package JavaPoo;

public class RunVehicle {

	public static void main(String[] args) {
		
		Vehicle truck = new Vehicle("Truck", "F18500", "Diesel", "White", "MS18500", "8mt");
		Vehicle car = new Vehicle("Car", "Ford K", "Gas", "Red", "PW800", "2.7mt");
		
		System.out.println(truck.getModel());
		System.out.println(car.getModel());
	}
}

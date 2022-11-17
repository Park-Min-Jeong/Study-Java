package classobject;

class Car {
	String kind;
	String color;
	int year;
	
	void run() {
		System.out.println("car is running");
	}
	
	void speedUp() {
		System.out.println("car is speeding up");
	}
}

public class Code46 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car myCar2;
		myCar2 = myCar;
		
		System.out.println(myCar);  // classobject.Car@506e1b77
		System.out.println(myCar2); // classobject.Car@506e1b77
		
		Car yourCar = new Car();
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		
		myCar.run();
		yourCar.run();
		
		myCar.speedUp();
		yourCar.speedUp();
	}
}

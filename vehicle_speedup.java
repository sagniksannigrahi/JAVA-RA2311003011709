class Vehicle{
    public void speedup()
    {
        System.out.println("Speeds up of vehicle..");
    }
}

class Car extends Vehicle{
    public void speedup()
    {
        int speed = 0;
        speed=speed +10;
        System.out.println("The overspeed of the car is -->"+speed);
    }
}

class Bicycle extends Vehicle{
    public void speedup()
    {
        int speed = 0;
        speed=speed +5;
        System.out.println("The overspeed of the bicle is -->"+speed);
    }
}


public class vehicle_speedup {
    public static void main(String[] args) {

        Vehicle v1=new Vehicle();
        Car v2= new Car();
        Bicycle v3= new Bicycle();

        v1.speedup();
        v2.speedup();
        v3.speedup();
    }
}

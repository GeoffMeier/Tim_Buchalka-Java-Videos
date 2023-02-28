package ClassesPart1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ();
        car.setColor("Black");
        car.setConvertible(false);
        car.setDoors(4);
        car.setMake("");
        System.out.println("MAke"+ car.getMake());
        car.describeCar();
    }
}

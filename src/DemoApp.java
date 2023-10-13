public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Car vwGolf8 = new Car();
        vwGolf8.colour = "Black";
        vwGolf8.countDoors = 5;
        vwGolf8.name = "Hurbey";
        vwGolf8.mileage = 234_211;

        Car audiA3 = new Car();
        audiA3.colour = "Red";
        audiA3.countDoors = 3;
        audiA3.name = "Audi";
        audiA3.mileage = 111_120;
    }
}

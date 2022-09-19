package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:

        Sensor kumpula = new StandardSensor(9);
        Sensor kaisaniemi = new StandardSensor(8);
        Sensor helsinkiVantaaAirport = new StandardSensor(7);

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

//        helsinkiRegion.setOn();
        System.out.println("");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());

    }
}

public class Main {
    public static void main(String[] args) {

        Flight bishkek = new Flight();
        bishkek.setFlightNumber(123);
        bishkek.setDestination("Bishkek");
        bishkek.setStatus("BOARDING");
        bishkek.setTime("2024-01-11");

        Flight flight1 = new Flight();
        flight1.setFlightNumber(456);
        flight1.setDestination("Naryn");
        flight1.setStatus("ON THE WAY");
        flight1.setTime("2024-01-11");

        Airport airport = new Airport();

        bishkek.updateStatus("ON THE WAY");

        airport.addFlight(bishkek);
        airport.addFlight(flight1);

        airport.displayAllFlights();



    }
}
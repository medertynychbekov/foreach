public class Airport {

    private Flight[] flights = new Flight[10];

    public void addFlight(Flight flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                flights[i] = flight;
                return;
            }
        }
    }

    public void displayAllFlights() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                flights[i].flightDetails();
            }
        }
    }
}

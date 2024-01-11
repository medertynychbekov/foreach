public class Flight {
    private int flightNumber;
    private String destination;
    private String time;
    public void updateStatus(String status) {
        this.status = status;
    }

    public void flightDetails() {
        System.out.println("-----------------------------------");
        System.out.println("Flight number: " + flightNumber);
        System.out.println("destination: " + destination);
        System.out.println("time: " + time);
        System.out.println("status: " + status);
    }

    private String status;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

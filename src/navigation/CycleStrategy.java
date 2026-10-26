package navigation;

public class CycleStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 15.0;
    private static final double BIKE_LANE_FACTOR = 1.05;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        double bikeDistance = distanceKm * BIKE_LANE_FACTOR;
        int minutes = (int) Math.round(bikeDistance / AVERAGE_SPEED_KMH * 60);
        return new Route("Cycle", from, to, bikeDistance, minutes);
    }
}
package navigation;

public class CarStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 50.0;
    private static final double ROAD_DETOUR_FACTOR = 1.2;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        double roadDistance = distanceKm * ROAD_DETOUR_FACTOR;
        int minutes = (int) Math.round(roadDistance / AVERAGE_SPEED_KMH * 60);
        return new Route("Car", from, to, roadDistance, minutes);
    }
}
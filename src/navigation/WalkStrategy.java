package navigation;

public class WalkStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 5.0;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60);
        return new Route("Walk", from, to, distanceKm, minutes);
    }
}
package navigation;

public class Main {

    public static void main(String[] args) {
        String from = "Astana IT University";
        String to = "Khan Shatyr";
        double distanceKm = 6.0;

        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.planRoute(from, to, distanceKm));

        navigator.setStrategy(new WalkStrategy());
        System.out.println(navigator.planRoute(from, to, distanceKm));

        navigator.setStrategy(new CycleStrategy());
        System.out.println(navigator.planRoute(from, to, distanceKm));

        // Runtime switching with a lambda strategy, no existing class touched
        navigator.setStrategy((f, t, d) -> new Route("Scooter", f, t, d, (int) Math.round(d / 20.0 * 60)));
        System.out.println(navigator.planRoute(from, to, distanceKm));
    }
}
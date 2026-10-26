package navigation;

public record Route(String mode, String from, String to, double distanceKm, int durationMinutes) {

    @Override
    public String toString() {
        return String.format("[%s] %s -> %s | %.1f km | %d min",
                mode, from, to, distanceKm, durationMinutes);
    }
}
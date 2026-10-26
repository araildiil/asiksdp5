# Strategy Pattern: Navigation / Route Planning

Java 17 implementation of the Strategy behavioral pattern. `Navigator` (Context) plans
routes using interchangeable `RouteStrategy` implementations (car, walk, cycle).

## Build and run
```bash
javac -d out src/navigation/*.java
java -cp out navigation.Main
```
Or open the project in IntelliJ IDEA (JDK 17) and run `navigation.Main`.

## Add a new strategy
1. Create a class implementing `RouteStrategy`, e.g. `BusStrategy`.
2. Implement `buildRoute(from, to, distanceKm)` and return a `Route`.
3. In the client, call `navigator.setStrategy(new BusStrategy())`.

No existing class needs to be modified.
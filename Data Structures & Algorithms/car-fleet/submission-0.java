class Solution{
public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;

    // Step 1 & 2 setup: pack position + time per car
    double[][] cars = new double[n][2];
    for (int i = 0; i < n; i++) {
        cars[i][0] = position[i];
        cars[i][1] = (double)(target - position[i]) / speed[i];
    }

    // Step 3: sort front-to-back (closest to target first)
    Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

    // Step 4: scan and count
    int fleets = 0;
    double currentFleetTime = 0;

    for (double[] car : cars) {
        double time = car[1];
        if (time > currentFleetTime) {
            fleets++;
            currentFleetTime = time;
        }
    }

    return fleets;
}
}
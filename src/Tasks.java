public class Tasks {
    // Задача 1
    public int drawsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
    // Задача 2
    public double priceCalculation(double price, int count) {
    return price * count;
    }
    // Задача 3
    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", radius);
    }

}


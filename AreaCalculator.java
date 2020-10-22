public class AreaCalculator {

    private static final String INVALID_MESSAGE = "Invalid input";

    public static double area(double radius){
        if (radius < 0){
            System.out.println(INVALID_MESSAGE);
            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            System.out.println(INVALID_MESSAGE);
            return -1;
        }

        return x * y;
    }
}

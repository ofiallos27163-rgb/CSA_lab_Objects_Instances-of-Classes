import java.awt.Point;
public class Lab1_12 {
    public static void main(String[] args) {
        System.out.println("Task 1: " + q1());
        System.out.println("Task 2: " + q2());
        System.out.println("Task 3: " + q3());
        System.out.println("Task 4: " + q4());
    }

    // 1. Create Point (5,10) and return coordinates
    public static String q1() {
        // TODO
        Point p1 = new Point(5, 10);
        String result1 = p1.getX() + ", " + p1.getY();
        return result1;
    }

    // 2. Move a Point (0,0) to (4,7) and return coordinates
    public static String q2() {
        // TODO
        Point p1 = new Point();
        p1.move(4,7);
        String result1 = p1.getX() + ", " + p1.getY();
        return result1;
    }

    // 3. Find distance between (0,0) and (3,4)
    public static double q3() {
        // TODO
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        return 0.0;
    }

    // 4. Show that two Points with same values are different objects
    public static String q4() {
        // TODO
        return "";
    }
}

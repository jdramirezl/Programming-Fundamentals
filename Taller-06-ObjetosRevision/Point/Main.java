package Point;

public class Main {
    public static void main(String[] args){
        Point p1 = new Point(20, 10);
        Point p2 = new Point(10, 10);

        System.out.println(p1.distance(p2));
    }
}

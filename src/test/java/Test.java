import ships.models.Point;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,1);
        Point q = new Point(2,2);
        p.setX(3);
        p.setY(3);
        p.useCount++;
        p.getOrigin().useCount++;
        System.out.println("(" + q.getX() + "," + q.getY() + ")");
        System.out.println(q.useCount);
        System.out.println(++q.getOrigin().useCount);
    }

}

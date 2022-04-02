package ships.models;

public class Point {
    private int x;
    private int y;
    public int useCount;
    private Point origin;
    // ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
       // this.origin = new Point(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }

    public Point getOrigin() {
        return new Point(0,0);
    }

    public boolean isPointNearCurrent(Point point){
        return isPointOccupied(point) || (Math.abs(this.x - point.getX()) == 1 && this.y == point.getY())
                || (Math.abs(this.y - point.getY()) == 1 && this.x == point.getX())
                || (Math.abs(this.y - point.getY()) == 1 && Math.abs(this.x - point.getX()) == 1);
    }

    public boolean isPointOccupied(Point point){
        return this.x == point.getX() && this.y == point.getY();
    }
}

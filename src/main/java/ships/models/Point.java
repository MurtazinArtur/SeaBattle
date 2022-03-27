package ships.models;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean isPointNearCurrent(Point point){
        return isPointOccupied(point) || (Math.abs(this.x - point.getX()) == 1 && this.y == point.getY())
                || (Math.abs(this.y - point.getY()) == 1 && this.x == point.getX())
                || (Math.abs(this.y - point.getY()) == 1 && Math.abs(this.x - point.getX()) == 1);
    }

    public boolean isPointOccupied(Point point){
        return this.x == point.getX() && this.y == point.getY();
    }
}

public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.hypot(x, y);
    }
    public double distance(Point point){
        int x2 = point.getX();
        int y2 = point.getY();

        return Math.hypot(x2-x, y2-y);
    }
    public double distance(int x, int y){
        return Math.hypot(x - this.x, y - this.y);
    }
}
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
//        double radius = getRadius();
//        return Math.PI * radius * radius * height;
        return getArea() * height;
    }
}

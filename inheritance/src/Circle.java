public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }else if(radius < 0) {
            this.radius = 0;
        }
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea() {
        return this.radius * radius * Math.PI;
    }
}
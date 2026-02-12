package tp3exosYaip5;

public class Cylinder {
	private Circle base;   
    private double height;

    public Cylinder() {
        this.base = new Circle();
        height = 1.0;
    }
    

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
 
    public static void main(String[] args) {
       Cylinder c1 = new Cylinder();
       System.out.println("Rayon: " + c1.getRadius());
       System.out.println("Hauteur: " + c1.getHeight());
       System.out.println("Volume: " + c1.getVolume());

       System.out.println("---");

       Circle circle2 = new Circle(5.0, "blue");
       Cylinder c2 = new Cylinder(circle2, 10.0);
       System.out.println("Rayon: " + c2.getRadius());
       System.out.println("Hauteur: " + c2.getHeight());
       System.out.println("Volume: " + c2.getVolume());
        }
}

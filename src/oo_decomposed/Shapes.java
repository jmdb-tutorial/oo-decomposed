package oo_decomposed;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

public class Shapes {

    public static interface Shape {

        public double area();

    }

    public static class Rectangle implements Shape {
        
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }
    }

    public static class Square extends Rectangle {

        public Square(double side) {
            super(side, side);
        }
    }

    public static class Circle implements Shape {

        private final double radius;


        public Circle(double radius) {
            this.radius = radius;
        }


        public double area() {
            return PI * pow(radius, 2);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 13);
        Square s = new Square(2);
        Circle c = new Circle(12);

        out.println(r.area());
        out.println(s.area());
        out.println(c.area());

    }

}

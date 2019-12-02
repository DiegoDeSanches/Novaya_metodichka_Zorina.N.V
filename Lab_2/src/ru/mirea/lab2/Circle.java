package ru.mirea.lab2;

public class Circle {

    private double x,
                   y,
                   r;
    private String color;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double x, double y, double r, String color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    @Override
        public String toString(){
        return "Circle{" + "x =" + x + ",y = " + y + ",r = " + r + ",color = '" + color + '\'' + '}';
    }

    public double getLength(){
        double c;
        c = 2 * Math.PI * r;
        return c;
    }
}

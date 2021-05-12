package OOP6;

import  java.awt.Color;


public class point2d extends point3d {

    private Color color;

    public point2d(){
        super();
        this.color = Color.BLACK;
    }

    public point2d(double x, double y, Color color){
        super(x, y, 0);
        this.color = color;
    }

    public point2d(double x, double y){
        super(x, y, 0);
        this.color = Color.BLACK;
    }

    public point2d(point2d other){
        super(other.getY(), other.getY(), 0);
        this.color = other.color;
    }

    public void draw(){
        StdDraw.setPenColor(this.color);
        StdDraw.point(this.getX(), this.getY());
    }

    public void move(double dx, double dy){
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }

    public void turn(double alpha){
        double x = this.getX();
        double y = this.getY();
        this.setX(x*Math.cos(Math.toRadians(alpha))-y*Math.sin(Math.toRadians(alpha)));
        this.setY(x*Math.sin(Math.toRadians(alpha))+y*Math.cos(Math.toRadians(alpha)));
    }
}

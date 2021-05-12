package OOP6;

import org.springframework.stereotype.Component;

import  java.awt.Color;

public abstract class shape {

    protected Color color;
    protected Color backgroundColor;

    public abstract double getPerimetr();

    public abstract double getArea();

    public abstract void draw();

    public void setColor(Color c){
        this.color = c;
    }

    public void setBackgroundColor(Color c){
        this.backgroundColor = c;
    }
}

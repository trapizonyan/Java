package Praktika3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.width=1;
        this.length=1;
    };
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    };
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
    };
    public double getWidth(){
        return this.width;
    };
    public void setWidth(double width){
        this.width=width;
    };
    public double getLength(){
        return this.length;
    };
    public void setLength(double length){
        this.length=length;
    };
    public double getArea(){
        return this.width *this.length;
    };
    public double getPerimeter(){
        return (this.width*2)+(this.length*2);
        };
    public String toString(){
        return "Rectangle";
    };

}

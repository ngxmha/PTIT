package J04002;

public class Rectangle{
    private double length, width;
    private String color;

    public Rectangle(){
        length = 1;
        width = 1;
    }

    public Rectangle(double length, double width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidht(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public double findArea(){
        return length * width;
    }

    public double findPerimeter(){
        return (length + width) * 2;
    }

    public void display(){
        System.out.printf("%d %d %s", (int)findPerimeter(), (int)findArea(), color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase());
    }
}

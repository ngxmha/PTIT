package J04009;

public class Point{
	private double x, y;

	public Point(){}

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public Point(Point p){
		x = p.x;
		y = p.y;
	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double distance(Point p){
		return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
	}

	public double distance(Point p1, Point p2){
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	public String toString(){
		return x + " " + y;
	}
}

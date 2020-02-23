
public class Klasa2 {
	int x;
	double y;
	
	public Klasa2() {
	}
	
	public Klasa2(int x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return this.y;
	}
		
	@Override
	public String toString() {
		return "x= " + this.x + ", y= " + this.y;
	}
	
}


public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	RegularPolygon(int num,double sid){
		n = num;
		side = sid;
		x = 0;
		y = 0;
	}
	
	RegularPolygon(int num,double sid,double xx,double yy){
		n = num;
		side = sid;
		x = xx;
		y = yy;
	}
	
	public int getN(){
		return n;
	}
	
	public void setN(int nn){
		n = nn;
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(int sside){
		side = sside;
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(int xx){
		x = xx;
	}
	
	public double getY(){
		return y;
	}
	
	public void setY(int yy){
		y = yy;
	}
	
	public double getPerimeter(){
		return n*side;
	}
	
	public double getArea(){
		return n*side*side/(4*Math.tan((Math.toRadians(180/n))));
	}
	
	public static void main(String[] args){
		RegularPolygon regu = new RegularPolygon();
		System.out.println("zhouchang:"+regu.getPerimeter()+" mianji"+regu.getArea());
		RegularPolygon regu1 = new RegularPolygon(6,4);
		System.out.println("zhouchang:"+regu1.getPerimeter()+" mianji"+regu1.getArea());
		RegularPolygon regu2 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("zhouchang:"+regu2.getPerimeter()+" mianji"+regu2.getArea());
	}

}
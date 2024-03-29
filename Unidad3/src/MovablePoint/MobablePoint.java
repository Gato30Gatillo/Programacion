package MovablePoint;

public class MobablePoint implements Movable{

	private int y;
	private int x;
	private int xspeed;
	private int yspeed;
	
	
	
	public MobablePoint(int y, int x, int xspeed, int yspeed) {
		super();
		this.y = y;
		this.x = x;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}
	
	

	public int getY() {
		return y;
	}



	public int getX() {
		return x;
	}



	public int getXspeed() {
		return xspeed;
	}



	public int getYspeed() {
		return yspeed;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void setX(int x) {
		this.x = x;
	}



	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}



	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}



	@Override
	public String toString() {
		return "MobablePoint [y=" + y + ", x=" + x + ", xspeed=" + xspeed +
				", yspeed=" + yspeed + "]";
	}



	@Override
	public void moveUp() {
		this.y -= this.yspeed;
	}

	@Override
	public void moveDown() {
		this.y += this.yspeed;
		
	}

	@Override
	public void moveLeft() {
		this.x -= this.xspeed;
		
	}

	@Override
	public void moveRight() {
		this.x += this.xspeed;
		
	}

}

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	
	public double x,y;
	public int width,height;
	
	public Enemy(int x, int y) {
		this.x=x;
		this.y=y;
		this.width=40;
		this.height = 5;
		
	}
	
public void tick() {
	x += (Pong.ball.x - x - 6)* 0.07;
	
}
public void render(Graphics g) {
	g.setColor(Color.MAGENTA);
	g.fillRect((int)x,(int)y, width, height);
}
}

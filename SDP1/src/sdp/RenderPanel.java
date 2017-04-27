package sdp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class RenderPanel extends JPanel{
	
	public static final Color GREEN = new Color(1666073);
	public BufferedImage monkey,banana;
	public static int score=0;
	public static int mx=30;
	public static int my=30;
	public static int bx=(int)((((int)(Math.random()*(100))%18)+1)*30);
	public static int by=(int)((((int)(Math.random()*(100))%18)+1)*30);
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(GREEN);
		g2.fillRect(0, 0, 600, 600);
		

		try {
			monkey=ImageIO.read(getClass().getResource("/Image/monkey.png"));
			g2.drawImage(monkey, mx,my,30,30,this);
			
			banana=ImageIO.read(getClass().getResource("/Image/banana.png"));
			g2.drawImage(banana, bx, by,30,30,this);
			g2.setColor(Color.red);
			g2.drawString("To WIN: 100    Your Score :"+score,300, 30);
			
			g2.drawString("Timer reset: 30seconds. ", 130, 30);
			
			
			g2.drawString("Eat 10 bananas in 2 minuites to win! ", 220, 560);
	       }catch (IOException e) 
	        		{
	        			// TODO Auto-generated catch block
	        			e.printStackTrace();
	        		}	
		
	}

}
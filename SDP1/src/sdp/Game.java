package sdp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;


public class Game implements ActionListener, KeyListener, State {
	//without timer  public Timer timer = new Timer(100, this);
	public JFrame jframe;
	public RenderPanel renderPanel;
	public Dimension dim;
	public Random random;
	public Timer timer = new Timer();
	public BananaRandom bananarandom = new BananaRandom();
	public MonkeyWin mw= new MonkeyWin();
	static Game game;
	State state;
	public Game()
	{
		dim = Toolkit.getDefaultToolkit().getScreenSize(); //returns screen size
		jframe = new JFrame("Monkey Banana Game");
		jframe.setVisible(true);
		jframe.setSize(600, 600);
		jframe.setResizable(false);
		jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);//sets in center of the screen
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		random=new Random();
		renderPanel= new RenderPanel();
		jframe.add(renderPanel );
		//state=new MonkeyMove();
		
		jframe.addKeyListener(new KeyAdapter()
				{

			@Override
			public void keyPressed(KeyEvent e) {
					
				//	renderPanel.updateTimer(Graphics g);
					 moveObject(e);
			}
				});

		timer.scheduleAtFixedRate(new TimerTask() {
			  @Override
			  public void run() {
				  bananarandom.randomFood();
			  }
			}, 1*30*1000, 1*30*1000);
		
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
				  mw.monkeyLose(game);
	
			  }
			}, 2*60*1000);
		
		state = new MonkeyMove();
		
	}
	public static void main(String[] args)
	{
		game = new Game();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

	public void moveObject(KeyEvent e)
	{
		int i = e.getKeyCode();
		if (i == KeyEvent.VK_A || i == KeyEvent.VK_LEFT) 
		{
			state=state.moveLeft(this);
			state=state.monkeyWin(this);
		}
		else if (i == KeyEvent.VK_D || i == KeyEvent.VK_RIGHT)
		{
			state=state.moveRight(this);
			
			state=state.monkeyWin(this);
		}
		else if (i == KeyEvent.VK_W || i == KeyEvent.VK_UP)
		{
			state=state.moveUp(this);
			state=state.monkeyWin(this);
		}
		else if (i == KeyEvent.VK_S || i == KeyEvent.VK_DOWN)	
		{
			state=state.moveDown(this);
			state=state.monkeyWin(this);
		}
		renderPanel.repaint();
	}	
	
	public JFrame getJframe() {
		return jframe;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent ev) {
		// TODO Auto-generated method stub
		
	}
	public State moveLeft(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	public State moveRight(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	public State moveUp(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	public State moveDown(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	public State eat(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	public State bananarandom(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public State monkeyWin(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

}

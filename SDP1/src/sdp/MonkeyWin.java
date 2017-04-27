package sdp;

import javax.swing.JOptionPane;

public class MonkeyWin implements State{
	RenderPanel renderPanel = new RenderPanel();
	
	public State monkeyWin(Game game)
	{
		JOptionPane.showMessageDialog(game.jframe,"Congratulation! You Win!");
		System.exit(0);
		return this;
	}
	public void monkeyLose(Game game)
	{
		JOptionPane.showMessageDialog(game.jframe,"Sorry! You loose!");
		System.exit(0);
		
		
	}

	@Override
	public State bananarandom(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public State moveLeft(Game game) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public State moveRight(Game game) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public State moveUp(Game game) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public State moveDown(Game game) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public State eat(Game game) {
		// TODO Auto-generated method stub
		return null;
	}




}

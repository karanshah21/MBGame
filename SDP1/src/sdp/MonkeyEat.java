package sdp;

public class MonkeyEat implements State{
	
	public RenderPanel renderPanel = new RenderPanel();
	public BananaRandom bananarandom = new BananaRandom();
	
	public State eat(Game game)
	{
			bananarandom.randomFood();
			renderPanel.repaint();
			return new MonkeyMove();
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
	public State monkeyWin(Game game) {
		// TODO Auto-generated method stub
		return null;
	}


}

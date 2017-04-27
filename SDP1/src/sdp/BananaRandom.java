package sdp;

public class BananaRandom implements State {
	
	public RenderPanel renderPanel= new RenderPanel();

	public void randomFood(){
		renderPanel.bx=(((int)((int)(Math.random()*(100))%18)+1)*30);
		renderPanel.by=(((int)((int)(Math.random()*(100))%18)+1)*30);
		renderPanel.repaint();
		
	}

	@Override
	public State moveLeft(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State moveRight(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State moveUp(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State moveDown(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public State eat(Game game) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
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

package sdp;

public class MonkeyMove implements State{
	
	public RenderPanel renderPanel = new RenderPanel();
	
//	public Game game=new Game();
	
	public State moveLeft(Game game)
	{
		int x=0;
		x-=30;
		renderPanel.mx+=x;
		if(isSame())
		{
			renderPanel.repaint();
			return new MonkeyEat().eat(game);
		}
		if(isWin())
		{
			renderPanel.repaint();
			return new MonkeyWin().monkeyWin(game);
		}
		renderPanel.repaint();
		return this;
	}
	public State moveRight(Game game)
	{
		int x=0;
		x+=30;
		renderPanel.mx+=x;
		if(isSame())
		{
			renderPanel.repaint();
			return new MonkeyEat().eat(game);
		}
		if(isWin())
		{
			renderPanel.repaint();
			return new MonkeyWin().monkeyWin(game);
		}
		renderPanel.repaint();
		return this;
		
	}
	public State moveUp(Game game)
	{
		int y=0;
		y-=30;
		renderPanel.my+=y;
		if(isSame())
		{
			renderPanel.repaint();
			return new MonkeyEat().eat(game);
		}
		if(isWin())
		{
			renderPanel.repaint();
			return new MonkeyWin().monkeyWin(game);
		}
		renderPanel.repaint();
		return this;
	}
	public State moveDown(Game game)
	{
		int y=0;
		y+=30;
		renderPanel.my+=y;
		if(isSame())
		{
			renderPanel.repaint();
			return new MonkeyEat().eat(game);
		}
		if(isWin())
		{
			renderPanel.repaint();
			return new MonkeyWin().monkeyWin(game);
		}
		renderPanel.repaint();
		return this;
	}
	public boolean isWin()
	{
		if(renderPanel.score>=100)
		{
			return true;
		}
		else 
			return false;
	}
	public boolean isSame()
	{
		if(renderPanel.bx==renderPanel.mx && renderPanel.by==renderPanel.my)
		{
			renderPanel.score+=10;
			renderPanel.repaint();
			return true;
		}
		else
		{
			renderPanel.repaint();
			return false;
		}
	}
	@Override
	public State bananarandom(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public State eat(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public State monkeyWin(Game game) {
		// TODO Auto-generated method stub
		return this;
	}
}

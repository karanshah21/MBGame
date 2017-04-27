package sdp;

public interface State {
	
	State  moveLeft(Game game);
	State  moveRight(Game game);
	State  moveUp(Game game);
	State  moveDown(Game game);
	State eat(Game game);
	State bananarandom(Game game);
	State monkeyWin(Game game);

}

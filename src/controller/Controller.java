package controller;

import imodel.IBricks;
import model.IBrick;
import model.Playfield;

public class Controller {
	
	Playfield playfld;
	
	public void init(int xSize, int ySize) {
		playfld = new Playfield(xSize, ySize);
		playfld.setBrick(createRandomBrick(), xSize/2, 3);
	}
	
	public int createRandomBrick() {
		return (int) (Math.random() % 7);
	}
	
	IBricks iBrick = new IBrick();
	
	
}

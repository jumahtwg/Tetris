package controller;



import model.Playfield;

public class Controller {
	enum EnumStatus {SquareBrick, LBrick, RevLBrick, TBrick, ZBrick, SBrick, IBrick };
	private Playfield playfld;

	
	public void init(int xSize, int ySize) {
		playfld = new Playfield(xSize, ySize);
	}
	
	public int createRandomBrick() {
		return (int) (Math.random() % 7);
			
		
	}
	
	
}

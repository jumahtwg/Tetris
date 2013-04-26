package controller;



import model.IBrick;
import model.LBrick;
import model.Playfield;
import model.RevLBrick;
import model.SBrick;
import model.SquareBrick;
import model.TBrick;
import model.ZBrick;


public class Controller {
	
	public enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	private EnumColor[][] actBrick;
	

	/*
	 * initialize the playfield with height and width
	 */
	public void init(int xSize, int ySize) {
		new Playfield(xSize, ySize);
	}
	
	
	public EnumColor[][] createRandomBrick() {
		int x = (int) (Math.random() % 6);
		EnumColor[] enums = EnumColor.values();
		EnumColor e = EnumColor.valueOf(enums[x].toString());
		switch (e) {
		case green:
			SquareBrick sqrbrick = new SquareBrick();
			actBrick = sqrbrick.getBrick();
			break;
		case blue:
			IBrick ibrick = new IBrick();
			actBrick = ibrick.getBrick();
			break;
		case empty:
			createRandomBrick();
			break;
		case orange:
			ZBrick zbrick = new ZBrick();
			actBrick = zbrick.getBrick();
			break;
		case purple:
			SBrick sbrick = new SBrick();
			actBrick = sbrick.getBrick();
			break;
		case red:
			RevLBrick revlbrick = new RevLBrick();
			actBrick = revlbrick.getBrick();
			break;
		case white:
			TBrick tbrick = new TBrick();
			actBrick = tbrick.getBrick();
			break;
		case yellow:
			LBrick lbrick = new LBrick();
			actBrick = lbrick.getBrick();
			break;
		default:
			break;
		}
		return actBrick;
		
		
			
		
	}
	
	
}

package controller;


import imodel.IBricks;
import observer.Observable;
import model.IBrick;
import model.LBrick;
import model.Playfield;
import model.RevLBrick;
import model.SBrick;
import model.SquareBrick;
import model.TBrick;
import model.ZBrick;



public class Controller extends Observable {
	

	private final int INITIALGAMESPEED = 1000;
	private int xSize;
	private int ySize;
	private int brickLine = 0;
	private int brickSlot = 0;
	private int gamespeed = INITIALGAMESPEED;
	private Playfield playfield;
	private Playfield tmpField;
	public enum EnumMove {moveLeft, moveRight, moveDown, moveUp};
	private EnumMove move;
	private int[][] playBrick;
	private IBricks brickObject;
	private int color;

	
	public EnumMove getMove() {
		return move;
	}

	public void setMove(EnumMove move) {
		this.move = move;
		switch(move) {
			case moveLeft:
				brickSlot--;
				break;
			case moveRight:
				brickSlot++;
				break;
			case moveDown:
				fastLowerBrick();
				break;
			case moveUp:
				brickObject.rotateRIGHT();
		}
	}

	public int[][] getPlayfield() {
		return playfield.getPlayfield();

	}
	public int getxSize() {
		return xSize;
	}

	public int getySize() {
		return ySize;
	}

	/*
	 * initialize the playfield with height and width
	 */
	public void init(int xSize, int ySize) {
		this.xSize = xSize;
		this.ySize = ySize;
		playfield = new Playfield(xSize, ySize);
		tmpField = playfield;
		
		setTopBrick();
	}
	
	public void setTopBrick() {
		playBrick = createRandomBrick();
		int middle = playfield.getStartMiddle();
		brickSlot = middle;
		if (playfield.getCheckCollision(playBrick, color, brickLine, brickSlot)) {
			System.out.println("collision on spawn - Game Over!!");
		} else {
			playfield.setBrick(playBrick, color, brickLine, brickSlot);
			notifyShowGameArray();
			lowerBrick();
		}
	}

	public void lowerBrick() {
		playfield = tmpField;
		++brickLine;
		if (playfield.getCheckCollision(playBrick, color, brickLine, brickSlot)) {
			System.out.println("Collision!");
			brickLine = 0;
			setTopBrick();
			
		} else {
			playfield.setBrick(playBrick, color, brickLine, brickSlot);
			tmpField = playfield;
			try {
				Thread.sleep(gamespeed);
				notifyShowGameArray();
				lowerBrick();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void fastLowerBrick() {
		
	}
	
	public void setGameSpeed(int speed) {
		gamespeed = speed;
	}
	
	public int[][] createRandomBrick() {
		color = (((int) ((Math.random()*10) % 7)))+1;
		int[][] actBrick = null;
		switch (color) {
		case 1:
			IBricks sqrbrick = new SquareBrick();
			actBrick = sqrbrick.getBrick();
			brickObject = sqrbrick;
			break;
		case 7:
			IBricks ibrick = new IBrick();
			actBrick = ibrick.getBrick();
			brickObject = ibrick;
			break;
		case 0:
			createRandomBrick();
			break;
		case 6:
			IBricks zbrick = new ZBrick();
			actBrick = zbrick.getBrick();
			brickObject = zbrick;
			break;
		case 5:
			IBricks sbrick = new SBrick();
			actBrick = sbrick.getBrick();
			brickObject = sbrick;
			break;
		case 3:
			IBricks revlbrick = new RevLBrick();
			actBrick = revlbrick.getBrick();
			brickObject = revlbrick;
			break;
		case 4:
			IBricks tbrick = new TBrick();
			actBrick = tbrick.getBrick();
			brickObject = tbrick;
			break;
		case 2:
			IBricks lbrick = new LBrick();
			actBrick = lbrick.getBrick();
			brickObject = lbrick;
			break;
		default:
			break;
		}
		return actBrick;	
	}

}

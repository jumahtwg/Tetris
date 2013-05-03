package controller;


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
	

	int xSize;
	int ySize;
	int brickLine = 0;
	int brickSlot = 0;
	private int gameSpeed = 1000;
	Playfield playfield;
	Playfield tmpField;
	public enum EnumMove {moveLeft, moveRight, moveDown};
	private EnumMove move;
	int[][] playBrick;
	int[][] actBrick;

	
	public EnumMove getMove() {
		return move;
	}

	public void setMove(EnumMove move) {
		this.move = move;
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
		notifyShowGameArray();
		setTopBrick();
	}
	
	public void setTopBrick() {
		playBrick = createRandomBrick();
		int middle = playfield.getStartMiddle();
		brickSlot = middle;
		if (playfield.getCheckCollision(playBrick, middle, brickLine) == true) {
			System.out.println("collision on spawn");
		} else {
			playfield.setBrick(playBrick, middle, brickLine);
			notifyShowGameArray();
			lowerBrick();
		}
	}

	public void lowerBrick() {
		playfield = tmpField;
		++brickLine;
		if (playfield.getCheckCollision(playBrick, brickSlot, brickLine)) {
			System.out.println("Collision!");
		} else {
			playfield.setBrick(playBrick, brickSlot, brickLine);
			tmpField = playfield;
			try {
				Thread.sleep(gameSpeed);
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
		gameSpeed = speed;
	}
	
	public int[][] createRandomBrick() {
		int x = (int) ((Math.random()*10) % 6);
		switch (x) {
		case 1:
			SquareBrick sqrbrick = new SquareBrick();
			actBrick = sqrbrick.getBrick();
			break;
		case 7:
			IBrick ibrick = new IBrick();
			actBrick = ibrick.getBrick();
			break;
		case 0:
			createRandomBrick();
			break;
		case 6:
			ZBrick zbrick = new ZBrick();
			actBrick = zbrick.getBrick();
			break;
		case 5:
			SBrick sbrick = new SBrick();
			actBrick = sbrick.getBrick();
			break;
		case 3:
			RevLBrick revlbrick = new RevLBrick();
			actBrick = revlbrick.getBrick();
			break;
		case 4:
			TBrick tbrick = new TBrick();
			actBrick = tbrick.getBrick();
			break;
		case 2:
			LBrick lbrick = new LBrick();
			actBrick = lbrick.getBrick();
			break;
		default:
			break;
		}
		return actBrick;	
	}

}

package model;

import imodel.IBricks;

public class LBrick implements IBricks {

	private int[][] brick;
	private int color;
	private int status;
	
	/*
	 * standard constructor
	 */
	public LBrick() {
		color = 2;
		brick = new int[FOUR][FOUR];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][2] = color;
		status = 0;
	}

	public int[][] getBrick() {
		return brick;
	}


	public int getColor() {
		return color;
	}
	

	
	public void setDirection(int status) {
		this.status = status;
	}
	
	public void clearBrick(int status) {
		for (int i=0;i<THREE;i++) {
			for ( int j=0; j<THREE; j++) {
				brick[i][j] = 0;
			}
		}
	}


	public void rotateLEFT() {
		clearBrick(status);
		switch(status) {
		case 0:
			brick[1][2] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			brick[THREE][1] = color;
			setDirection(3);
			break;
		case 1:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setDirection(0);
			break;
		case 2:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[0][2] = color;
			setDirection(1);
			break;
		case 3:
			brick[1][0] = color;
			brick[2][0] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			setDirection(2);
			break;
		}
		
	}

	public void rotateRIGHT() {
		clearBrick(status);
		switch(status) {
		case 0:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[0][2] = color;
			setDirection(1);
			break;
		case 1:
			brick[1][0] = color;
			brick[2][0] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			setDirection(2);
			break;
		case 2:
			brick[1][2] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			brick[THREE][1] = color;
			setDirection(3);
			break;
		case 3:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setDirection(0);
			break;
		}
	}

}

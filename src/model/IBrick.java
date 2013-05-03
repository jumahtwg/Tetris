package model;

import imodel.IBricks;



public class IBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private int status;
	private static final int FOUR = 4;
	/*
	 * standard constructor
	 */
	public IBrick() {
		color = 7;
		brick = new int[FOUR][FOUR];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][THREE] = color;
		status = 0;
	}

	public int[][] getBrick() {
		return brick;
	}
	
	public void setDirection(int status) {
		this.status= status;
	}


	public int getColor() {
		return color;
	}
	
	
	public void clearBrick(int status) {
		for (int i=0;i<FOUR;i++) {
			for ( int j=0; j<FOUR; j++) {
				brick[i][j] = 0;
			}
		}
	}

	public void rotateLEFT() {
		clearBrick(status);
		if(status == 0 || status == 2) {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[THREE][1] = color;
			setDirection(1);
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][THREE] = color;
			setDirection(0);
		}

		
	}

	public void rotateRIGHT() {
		rotateLEFT();
	}
}

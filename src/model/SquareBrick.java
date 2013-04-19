package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	int[][] brick;
	int color;
	int status;
	
	SquareBrick() {
		status = 0;
		color = 1;
		brick = new int[3][3];
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		
	}
	public int[][] getBrick() {
		return brick;
	}

	public int getColor() {
		return color;
	}
	public void rotateLEFT(int status) {
		//squareBrick => do nothing
		
	}
	public void rotateRIGHT(int status) {
		//squareBrick => do nothing
		
	}

}

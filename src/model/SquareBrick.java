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
	@Override
	public int[][] getBrick() {
		return brick;
	}

	@Override
	public int getColor() {
		return color;
	}
	@Override
	public void rotateLEFT(int status) {
		//squareBrick => do nothing
		
	}
	@Override
	public void rotateRIGHT(int status) {
		//squareBrick => do nothing
		
	}

}

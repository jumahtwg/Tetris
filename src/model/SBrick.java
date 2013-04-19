package model;

import imodel.IBricks;

public class SBrick implements IBricks {
	
	int[][] brick;
	int color;
	
	SBrick() {
		int[][] squareBrick = { {1,2}, {2,1}, {2,2}, {3,1} };
		brick = squareBrick;
		color = 5;
	}

	public int[][] getBrick() {
		return brick;
	}


	public int getColor() {
		return color;
	}

	public void rotateLEFT(int status) {
		// TODO Auto-generated method stub
		
	}

	public void rotateRIGHT(int status) {
		// TODO Auto-generated method stub
		
	}
}

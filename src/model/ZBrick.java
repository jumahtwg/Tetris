package model;

import imodel.IBricks;


public class ZBrick implements IBricks {

	int[][] brick;
	int color;
	
	ZBrick() {
		int[][] squareBrick = { {1,1}, {2,1}, {2,2}, {3,2} };
		brick = squareBrick;
		color = 6;
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

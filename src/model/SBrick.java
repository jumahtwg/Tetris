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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rotateRIGHT(int status) {
		// TODO Auto-generated method stub
		
	}
}

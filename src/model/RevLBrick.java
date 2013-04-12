package model;

import imodel.IBricks;

public class RevLBrick implements IBricks {
	
	int[][] brick;
	int color;
	
	RevLBrick() {
		int[][] squareBrick = { {2,0}, {2,1}, {2,2}, {1,2} };
		brick = squareBrick;
		color = 3;
	}
	@Override
	public int[][] getBrick() {
		return brick;
	}

	@Override
	public int getColor() {
		return color;
	}

}

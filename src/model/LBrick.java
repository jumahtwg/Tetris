package model;

import imodel.IBricks;

public class LBrick implements IBricks {

	int[][] brick;
	int color;
	
	LBrick() {
		int[][] squareBrick = { {1,0}, {1,1}, {1,2}, {2,2} };
		brick = squareBrick;
		color = 2;
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

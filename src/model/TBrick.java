package model;

import imodel.IBricks;

public class TBrick implements IBricks {
	
	int[][] brick;
	int color;
	
	TBrick() {
		int[][] squareBrick = { {1,2}, {2,1}, {2,2}, {3,2} };
		brick = squareBrick;
		color = 4;
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

package model;

public class ZBrick implements IBricks {

	int[][] brick;
	int color;
	
	ZBrick() {
		int[][] squareBrick = { {1,1}, {2,1}, {2,2}, {3,2} };
		brick = squareBrick;
		color = 6;
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
package model;

public class SquareBrick implements IBricks {

	int[][] brick;
	int color;
	
	SquareBrick() {
		int[][] squareBrick = { {1,1}, {2,1}, {2,3}, {3,3} };
		brick = squareBrick;
		color = 1;
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

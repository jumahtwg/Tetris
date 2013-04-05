package model;

public class IBrick implements IBricks {
	
	int[][] brick;
	int color;
	
	public IBrick() {
		int[][] squareBrick = { {1,1}, {2,1}, {3,1}, {4,1} };
		brick = squareBrick;
		color = 7;
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

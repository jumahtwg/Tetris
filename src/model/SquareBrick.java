package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	private int[][] brick;
	private int color;
	private EnumStatus status;
	
	SquareBrick() {
		status = EnumStatus.up;
		color = 1;
		brick = new int[3][3];
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		
	}
	public int[][] getBrick() {
		return brick;
	}

	public int getColor() {
		return color;
	}
	
	public EnumStatus getStatus() {
		return status;
	}

	public void rotateLEFT(EnumStatus status) {
		//squareBrick => do nothing
		
	}
	public void rotateRIGHT(EnumStatus status) {
		//squareBrick => do nothing
		
	}

}

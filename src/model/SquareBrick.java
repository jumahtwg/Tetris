package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	private int[][] brick;
	private int color;
	private int status;
	
	/*
	 * standard constructor
	 */
	public SquareBrick() {
		status = 0;
		color = 1;
		brick = new int[THREE][THREE];
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		
	}
	public int[][] getBrick() {
		return brick;
	}
	
	public int getStatus() {
		return status;
	}

	public int getColor() {
		return color;
	}
	
	public void setDirection(int status) {
		this.status= status;
	}
	

	public void rotateLEFT() {
		//squareBrick => do nothing
		
	}
	public void rotateRIGHT() {
		//squareBrick => do nothing
		
	}

}

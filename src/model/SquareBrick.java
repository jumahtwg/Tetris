package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	private int[][] brick;
	private int color;
	private String status;
	
	/*
	 * standard constructor
	 */
	public SquareBrick() {
		status = "up";
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

	public int getColor() {
		return color;
	}
	
	public void setDirection(String status) {
		this.status= status;
	}
	

	public void rotateLEFT() {
		//squareBrick => do nothing
		
	}
	public void rotateRIGHT() {
		//squareBrick => do nothing
		
	}

}

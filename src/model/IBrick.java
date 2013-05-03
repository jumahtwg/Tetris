package model;

import imodel.IBricks;



public class IBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private String status;
	/*
	 * standard constructor
	 */
	public IBrick() {
		color = 7;
		brick = new int[THREE][THREE];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][THREE] = color;
		status = "up";
	}

	public int[][] getBrick() {
		return brick;
	}
	
	public void setDirection(String status) {
		this.status= status;
	}


	public int getColor() {
		return color;
	}
	
	
	public void clearBrick(String status) {
		for (int i=0;i<THREE;i++) {
			for ( int j=0; j<THREE; j++) {
				brick[i][j] = 0;
			}
		}
	}

	public void rotateLEFT() {
		clearBrick(status);
		if(status == "up" || status == "down") {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[THREE][1] = color;
			setDirection("right");
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][THREE] = color;
			setDirection("up");
		}

		
	}

	public void rotateRIGHT() {
		rotateLEFT();
	}
}

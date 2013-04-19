package model;

import imodel.IBricks;

public class IBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private int status;
	
	public IBrick() {
		color = 7;
		brick = new int[3][3];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][3] = color;
		
		color = 7;
		status = 0;
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

	public void rotateLEFT(int status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		if(status == 0 || status == 2) {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			status = 1;
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			status = 3;
		}

		
	}

	public void rotateRIGHT(int status) {
		rotateLEFT(status);
	}
}

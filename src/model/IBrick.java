package model;

import imodel.IBricks;

public class IBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private EnumStatus status;
	
	public IBrick() {
		color = 7;
		brick = new int[3][3];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][3] = color;
		
		color = 7;
		status = EnumStatus.up;
	}

	public int[][] getBrick() {
		return brick;
	}
	
	public EnumStatus getStatus() {
		return status;
	}


	public int getColor() {
		return color;
	}

	public void rotateLEFT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		if(status == EnumStatus.up || status == EnumStatus.down) {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			status = EnumStatus.right;
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			status = EnumStatus.up;
		}

		
	}

	public void rotateRIGHT(EnumStatus status) {
		rotateLEFT(status);
	}
}

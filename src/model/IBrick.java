package model;

import imodel.IBricks;

public class IBrick implements IBricks {
	
	private EnumColor[][] brick;
	private EnumColor color;
	private EnumStatus status;
	
	public IBrick() {
		color = EnumColor.blue;
		brick = new EnumColor[3][3];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][3] = color;
		status = EnumStatus.up;
	}

	public EnumColor[][] getBrick() {
		return brick;
	}
	
	public EnumStatus getStatus() {
		return status;
	}


	public EnumColor getColor() {
		return color;
	}
	
	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public void rotateLEFT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = EnumColor.empty;
			}
		}
		if(status == EnumStatus.up || status == EnumStatus.down) {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			setStatus(EnumStatus.right);
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			setStatus(EnumStatus.up);
		}

		
	}

	public void rotateRIGHT(EnumStatus status) {
		rotateLEFT(status);
	}
}

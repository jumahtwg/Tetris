package model;

import imodel.IBricks;


public class IBrick implements IBricks {
	
	private controller.Controller.EnumColor[][] brick;
	private controller.Controller.EnumColor color;
	private EnumStatus status;
	/*
	 * standard constructor
	 */
	public IBrick() {
		color = controller.Controller.EnumColor.blue;
		brick = new controller.Controller.EnumColor[THREE][THREE];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[1][THREE] = color;
		status = EnumStatus.up;
	}

	public controller.Controller.EnumColor[][] getBrick() {
		return brick;
	}
	
	public EnumStatus getStatus() {
		return status;
	}


	public controller.Controller.EnumColor getColor() {
		return color;
	}
	
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	public void clearBrick(EnumStatus status) {
		for (int i=0;i<THREE;i++) {
			for ( int j=0; j<THREE; j++) {
				brick[i][j] = controller.Controller.EnumColor.empty;
			}
		}
	}

	public void rotateLEFT(EnumStatus status) {
		clearBrick(status);
		if(status == EnumStatus.up || status == EnumStatus.down) {
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[THREE][1] = color;
			setStatus(EnumStatus.right);
		} else {
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][THREE] = color;
			setStatus(EnumStatus.up);
		}

		
	}

	public void rotateRIGHT(EnumStatus status) {
		rotateLEFT(status);
	}
}

package model;

import imodel.IBricks;


public class ZBrick implements IBricks {

	private controller.Controller.EnumColor[][] brick;
	private controller.Controller.EnumColor color;
	private EnumStatus status;
	
	/*
	 * standard constructor
	 */
	public ZBrick() {
		color = controller.Controller.EnumColor.orange;
		brick = new controller.Controller.EnumColor[THREE][THREE];
		brick[1][1] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		brick[THREE][2] = color;
		status = EnumStatus.up;
	}

	public controller.Controller.EnumColor[][] getBrick() {
		return brick;
	}


	public controller.Controller.EnumColor getColor() {
		return color;
	}
	
	public EnumStatus getStatus() {
		return status;
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
		switch(status) {
		case up:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setStatus(EnumStatus.up);
			break;
		}		
	}

	public void rotateRIGHT(EnumStatus status) {
		clearBrick(status);
		switch(status) {
		case up:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setStatus(EnumStatus.up);
			break;
		}		
	}

}

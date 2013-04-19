package imodel;

public interface IBricks {
	
	enum EnumStatus {up, right, down, left };
	enum EnumColor {green, yellow, red, white, purple, orange, blue};
	public int[][] getBrick();
	public int getColor();
	public void rotateLEFT(EnumStatus stat);
	public void rotateRIGHT(EnumStatus stat);
	public void setStatus(EnumStatus status);
	
	
}

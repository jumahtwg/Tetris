package imodel;

public interface IBricks {
	
	enum EnumStatus {up, right, down, left };
	enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	public EnumColor[][] getBrick();
	public EnumColor getColor();
	public void rotateLEFT(EnumStatus stat);
	public void rotateRIGHT(EnumStatus stat);
	public void setStatus(EnumStatus status);
	public static int THREE = 3;
	
	
}

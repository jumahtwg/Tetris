package imodel;

public interface IBricks {
	
	enum EnumStatus {up, right, down, left };
	enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	EnumColor[][] getBrick();
	EnumColor getColor();
	void rotateLEFT(EnumStatus stat);
	void rotateRIGHT(EnumStatus stat);
	void setStatus(EnumStatus status);
	static int THREE = 3;
	
	
}

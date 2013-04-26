package imodel;

public interface IBricks {
	
	/*
	 * set status in which side the brick show
	 */
	enum EnumStatus {up, right, down, left };
	/*
	 * set enum if color or empty
	 */
//	public enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	/*
	 * get the brick back as EnumColor-Array
	 */
	controller.Controller.EnumColor[][] getBrick();
	/*
	 * get the color or empty
	 */
	controller.Controller.EnumColor getColor();
	/*
	 * rotate the brick to the left side
	 */
	void rotateLEFT(EnumStatus stat);
	/*
	 * rotate the brick to the right side
	 */
	void rotateRIGHT(EnumStatus stat);
	/*
	 * set the enum status (color or empty)
	 */
	void setStatus(EnumStatus status);
	/*
	 * variable against magic numbers
	 */
	static int THREE = 3;
	
	
}

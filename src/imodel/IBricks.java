package imodel;

public interface IBricks {
	
	model.EnumColor[][] getBrick();
	/*
	 * get the color or empty
	 */
	model.EnumColor getColor();
	/*
	 * rotate the brick to the left side
	 */
	void rotateLEFT(model.EnumStatus stat);
	/*
	 * rotate the brick to the right side
	 */
	void rotateRIGHT(model.EnumStatus stat);
	/*
	 * set the enum status (color or empty)
	 */
	void setStatus(model.EnumStatus status);
	/*
	 * variable against magic numbers
	 */
	static int THREE = 3;
	
	
}

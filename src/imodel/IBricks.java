package imodel;
import model.EnumColor;
import model.EnumStatus;

public interface IBricks {
	
	EnumColor[][] getBrick();
	/*
	 * get the color or empty
	 */
	EnumColor getColor();
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

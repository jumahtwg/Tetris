package imodel;



public interface IBricks {
	
	int[][] getBrick();
	/*
	 * get the color or empty
	 */
	int getColor();
	/*
	 * rotate the brick to the left side
	 */
	void rotateLEFT();
	/*
	 * rotate the brick to the right side
	 */
	void rotateRIGHT();
	/*
	 * set the enum status (color or empty)
	 */
	void setDirection(int status);
	/*
	 * variable against magic numbers
	 */
	static int THREE = 3;
	
	
}

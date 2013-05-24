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
	final int THREE = 3;
	final int FOUR = 4;
	final int SQUAREBRICK = 1;
	final int LBRICK = 2;
	final int REVLBRICK = 3;
	final int TBRICK = 4;
	final int SBRICK = 5;
	final int ZBRICK = 6;
	final int IBRICK = 7;
	
	
	
	
}

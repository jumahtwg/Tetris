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
	int THREE = 3;
	int FOUR = 4;
	int SQUAREBRICK = 1;
	int LBRICK = 2;
	int REVLBRICK = 3;
	int TBRICK = 4;
	int SBRICK = 5;
	int ZBRICK = 6;
	int IBRICK = 7;
	
	
	
	
}

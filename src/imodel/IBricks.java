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
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int SQUAREBRICK = 1;
	public static final int LBRICK = 2;
	public static final int REVLBRICK = 3;
	public static final int TBRICK = 4;
	public static final int SBRICK = 5;
	public static final int ZBRICK = 6;
	public static final int IBRICK = 7;
	
	
	
	
}

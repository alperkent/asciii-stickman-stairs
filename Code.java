
public class MAE2019742009 {

	/* Main method includes:
	 * variable declarations for the heights of the stick-man and the stairs 
	 * and a for loop that executes two methods for each frame
	 */
		
	public static void main(String[] args) {
		
		int stickmanHeight = Integer.parseInt(args[0]); // height of stick-man
		int stairHeight = Integer.parseInt(args[1]); // height of stairs
		
		for (int frame = 0; frame <= stairHeight; frame++) { // this for loop declares a variable for frame count and executes other methods for each frame
			stickmanAndStairs(stickmanHeight, stairHeight, frame);
			onlyStairs(stairHeight, frame);
		}
		
	}
	
	/* This method "stickmanAndStairs" executes:
	 * empty lines above each frame
	 * and stick-man figure with the corresponding part of stairs in line with it
	 */
	
	public static void stickmanAndStairs(int stickmanHeight, int stairHeight, int frame) {
		
		for (int header = stairHeight-frame; header > 0; header--) { // this for loop prints the lines above each frame
			System.out.println();
		}
		
		space1(frame); // prints necessary spaces for each line before stick-man
		System.out.print(" O \n"); // prints head of stick-man
		
		space1(frame);	// see the comment in line 32
		System.out.print("/|\\\n"); // prints arm and chest of stick-man
		
		for (int torso1 = 1; torso1 <= stickmanHeight-stairHeight-3+frame; torso1++) { // this nested for loop prints trunk of stick-man that is above the stairs for each frame
			space1(frame);	// see the comment in line 32
			System.out.print(" | \n");
		}
				
		for (int level = 0; level <= stairHeight-frame; level++) { // this nested for loop prints the part of each frame that includes both stick-man and stairs
			space1(frame);	// see the comment in line 32
			for (int torso2 = stairHeight-frame; torso2 > level; torso2 = level) { // this for loop prints trunk of stick-man that is in line with stairs for each frame
				System.out.print(" | ");
			}
			for (int foot = stairHeight-frame; foot <= level; foot++) { // this for loop prints feet of stick-man
				System.out.print("/ \\");
			}
			for (int space2 = stairHeight-frame-1; space2 >= level; space2--) { // this for loop prints spaces between stick-man and stairs
				System.out.print("   ");
			}
			System.out.print("___|"); // prints steps of stairs
			for (int stars = level; stars >= 1; stars--) { // this for loop prints stars for each level of stairs
				System.out.print("***");
			}
			System.out.print("|\n"); // prints end of stairs
		}
		
	}
	
	/* This method "onlyStairs" executes:
	 * part of stairs that stays below stick-man in each frame
	 * and three empty lines of space between each frame
	 */
	
	public static void onlyStairs(int stairHeight, int frame) {
		
		for (int level = 1; level <= frame; level++) { // this for loop prints stairs below stick-man for each frame
			for (int space = frame; space >= level; space--) { // this for loop prints spaces before stairs
				System.out.print("   ");
			}
			System.out.print("___|"); // see comment in line 62
			for (int stars = stairHeight-frame+level; stars > 0; stars--) { // see comment in line 63
				System.out.print("***");
			}
			System.out.print("|\n"); // see comment in line 66
		}
		
		System.out.println("\n\n"); // prints three empty lines after each frame
		
	}
	
	/* This method "spaces1" executes:
	 * spaces before stick-man for each line according to frame number
	 */
	
	public static void space1(int frame) {
		
		for (int space1 = 0; space1 < frame; space1++) { // see the comment in line 32
			System.out.print("   ");
		}
		
	}
		
}
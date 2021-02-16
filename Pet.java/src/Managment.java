
public class Managment {
	
	public static void petMove(int currentSpace, int endSpace) {
		int newSpaceNbr = endSpace;
		System.out.println("The Pets new Space is now: " + newSpaceNbr);
		
		
		
	}
	
	public static void feedingTime(int timesFed) {
		
		if(timesFed < 13) {
			System.out.println("Pet was fed in the AM");
			
		}
		else {
			System.out.println("Pet was fed in the PM");
		}
		}
	public static void cleanSpace(boolean spaceClean) {
		
		if(spaceClean) {
			System.out.println("This Space is Ready for Use");
		}
		else {
			System.out.println("This space needs to be Cleaned");
		}
		
	}

}

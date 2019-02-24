public class questions{
	public static void main(String[] args) {
		flip();
	}
	
	//Act3 Q1
	public static String flip(){
		String[] flips = new String[6];
		flips[1] = "heads"; 
		flips[0] = "tails";
		flips[2] = "heads";
		flips[3] = "tails";
		flips[4] = "heads";
		flips[5] = "heads";
		String answer = flips[(int)(Math.round((Math.random()))) * 5];
		System.out.println(answer);
		return (answer);
	}
	
	//Act3 q2
	public static boolean arePermutations(int[] first, int[] second) {
		if(first.length == 0) {
			return true;
		}
		for(int i = 0; i < first.length; i++) {
			boolean found = false;
			for(int num : second) {
				if(first[i] == num) {
					found = true;
				}
			}
			if(found == false) {
				return false;
			}
		}
		return true;
	}
	
	
}
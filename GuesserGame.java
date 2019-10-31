public class GuesserGame {

	public static void main(String[] args) {

	int start = Integer.parseInt(args[0]);
	int stop = Integer.parseInt(args[1]);
		
		 Guesser guesser = new Guesser(start, stop);
		 guesser.start();
		 
		 
	}

}

public class Card {
	
	public void doSomethingWithCards(char suit, int num, char other) {
		
		if (suit != 'H' &&
			suit != 'C' &&
			suit != 'D' &&
			suit != 'S') {
			throw new BadSuitException();
		}
		if (num < 1 || num > 10) {
			throw new
				IllegalArgumentException("num should be between 1 and 10 inclusive");
		}
		
	}
}

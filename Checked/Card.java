public class Card {
	
	public void doSomethingWithCards(char suit, int num, char other)
		throws BadSuitException {
		
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

	public static void main(String [] args) {
		Card c = new Card();
		try {
			c.doSomethingWithCards('H',2,'Q');
		} catch (BadSuitException bse) {
			// do something
		} catch (IllegalArgumentException ile) {
			// do something
		} catch (Exception e) {
			System.err.println("Something bad");
		} 
	}

}

package countinggames.fizzbuzz;

import countinggames.ConsoleWriter;
import countinggames.CountingGame;

public class FizzBuzzApp extends CountingGame {

	public static void main(String[] args) {
		new FizzBuzzApp(100).count();
	}

	public FizzBuzzApp(int countTo) {
		super(countTo, new FizzBuzz(), new ConsoleWriter());
	}
}

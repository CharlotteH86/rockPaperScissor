package rockPaperScissor;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// Första spelaren skriver in sitt val av alterantiv. firstPlayer läser av
		// texten som skrivs in.
		System.out.println("Choose your option between rock, paper or scissor to start the game: ");
		String firstPlayer = reader.nextLine();
		// Om firstPlayer är samma som "stone", "rock" eller scissor" så kommer detta
		// bekräftas i rutan nedan. Inte optimalt om det var ett "äkta" spel.
		if (firstPlayer.equals("rock") || firstPlayer.equals("stone") || firstPlayer.equals("scissor")) {
			System.out.println("You choose: " + firstPlayer);

		}
		// Spelare nr två använder sig av samma procedur som spelare ett.
		System.out.println("Second player choose your move: ");
		String secondPlayer = reader.nextLine();
		if (secondPlayer.equals("rock") || secondPlayer.equals("stone") || secondPlayer.equals("scissor")) {
			System.out.println("Second player choose: " + secondPlayer);

		}
		// Om spelare har samma alternativ som spelare två kommer det bli oavgjort, tie.
		if (firstPlayer.equals(secondPlayer)) {
			System.out.println("Tie!");
			// Om spelare ett har ett alternativ som är vinnande, t.ex paper > rock, så
			// retuneras att spelare ett har vunnit. Annars förklaras spelare ett som
			// förlorare.
		} else if (firstPlayer.equals("paper") && secondPlayer.equals("rock")
				|| firstPlayer.equals("scissor") && secondPlayer.equals("paper")
				|| firstPlayer.equals("rock") && secondPlayer.equals("scissor")) {
			System.out.println("First player won!");
		} else {
			System.out.println("First player lost the game!");
		}

	}

}

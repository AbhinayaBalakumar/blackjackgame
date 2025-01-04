package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds: " + game.getHouseCards() + "\n");
        System.out.println("You hold: " + game.getYourCards()+ "\n");
    }

  @Override
    public boolean hitMe() {
        System.out.print("Another card?: ");
        String s = user.nextLine();
        return s == "y";
    }

  @Override
    public void gameOver() {
        System.out.println("Game over!");
        display();
        System.out.println("Your score: " + game.score(game.getYourCards()) + ", House score: " + game.score(game.getHouseCards()));
        if (game.score(game.getYourCards()) < game.score(game.getHouseCards())){
            System.out.println("You win");
        }
        else if (game.score(game.getYourCards()) > game.score(game.getHouseCards())) {
            System.out.println("The House wins");
        }
    }

}
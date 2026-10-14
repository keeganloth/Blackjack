import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class blackjack {
    static int bet = 0;
    static int account = 500;
    static boolean stillPlaying = true;
    static ArrayList<Card> playerHand = new ArrayList<>();
    static ArrayList<Card> dealerHand = new ArrayList<>();
    static int dealerTotal = 0;
    static int playerTotal = 0;
    static Scanner userIntImput = new Scanner(System.in);

    public static void main(String[] args) {
        while (stillPlaying) {
            resetRound();
            Deck.fillDeck();
            Collections.shuffle(Deck.cardDeck);
            betting();
            dealCards();
            boolean roundOver = checkFirstWin();
            if (!roundOver) {
                roundOver = hitOrStand();
            }
            if (!roundOver) {
                roundOver = finalDraw();
            }
            if (!roundOver) {
                finalStand();
            }
            if (account <= 0) {
                System.out.println("You are out of money! Game over.");
                break;
            }
            System.out.println("\nDo you want to (1) play again, or (2) leave the table?");
            int playing = userIntImput.nextInt();
            if (playing == 2) {
                System.out.println("Thanks for playing! You left with $" + account);
                stillPlaying = false;
            }
        }
    }

    public static void resetRound() {
        playerHand.clear();
        dealerHand.clear();
        playerTotal = 0;
        dealerTotal = 0;
    }

    public static void betting() {
        System.out.println("You have $" + account + " in your account.");
        System.out.println("What would you like to bet?");
        bet = userIntImput.nextInt();

        while (bet > account || bet <= 0) {
            System.out.println("Invalid bet amount. Enter a valid bet:");
            bet = userIntImput.nextInt();
        }
    }

    public static void dealCards() {
        playerHand.add(Deck.cardDeck.remove(0));
        dealerHand.add(Deck.cardDeck.remove(0));
        playerHand.add(Deck.cardDeck.remove(0));
        dealerHand.add(Deck.cardDeck.remove(0));

        System.out.println("You were dealt:");
        for (Card c : playerHand) {
            System.out.println(c.getArt());
        }
    }

    public static boolean checkFirstWin() {
        playerTotal = 0;
        for (Card c : playerHand) {
            playerTotal += c.getValue();
        }

        dealerTotal = 0;
        for (Card c : dealerHand) {
            dealerTotal += c.getValue();
        }

        if (playerTotal == 21 && dealerTotal == 21) {
            System.out.println("Both you and the dealer got 21! It's a push.");
            return true;
        } else if (playerTotal == 21) {
            System.out.println("Blackjack! You win!");
            account += bet;
            return true;
        } else if (dealerTotal == 21) {
            System.out.println("The dealer has Blackjack! You lose.");
            account -= bet;
            return true;
        }

        return false;
    }

    public static boolean hitOrStand() {
        boolean stillHitting = true;

        while (stillHitting) {
            System.out.println("\nYour total: " + playerTotal);
            System.out.println("The dealer is showing:");
            System.out.println(dealerHand.get(0).getArt());
            System.out.println("Do you want to (1) hit or (2) stand?");
            int choice = userIntImput.nextInt();

            if (choice == 1) {
                Card newCard = Deck.cardDeck.remove(0);
                playerHand.add(newCard);
                System.out.println("You were dealt:");
                System.out.println(newCard.getArt());

                // Recalculate total
                playerTotal = 0;
                for (Card c : playerHand) {
                    playerTotal += c.getValue();
                }

                if (playerTotal > 21) {
                    System.out.println("You bust with " + playerTotal + "! You lose.");
                    account -= bet;
                    return true;
                }
            } else if (choice == 2) {
                stillHitting = false;
            }
        }
        return false;
    }

    public static boolean finalDraw() {
        System.out.println("\nDealer reveals hidden card:");
        System.out.println(dealerHand.get(1).getArt());
        System.out.println("Dealer total: " + dealerTotal);

        while (dealerTotal < 17) {
            Card drawnCard = Deck.cardDeck.remove(0);
            dealerHand.add(drawnCard);
            System.out.println("The dealer drew:");
            System.out.println(drawnCard.getArt());

            dealerTotal = 0;
            for (Card c : dealerHand) {
                dealerTotal += c.getValue();
            }

            System.out.println("Dealer total is now " + dealerTotal);
        }

        if (dealerTotal > 21) {
            System.out.println("Dealer busts! You win!");
            account += bet;
            return true;
        }

        return false;
    }

    public static void finalStand() {
        System.out.println("\n--- Final Results ---");
        System.out.println("Your total: " + playerTotal);
        System.out.println("Dealer total: " + dealerTotal);

        if (dealerTotal > playerTotal) {
            System.out.println("Dealer wins!");
            account -= bet;
        } else if (playerTotal > dealerTotal) {
            System.out.println("You win!");
            account += bet;
        } else {
            System.out.println("It's a tie (Push)!");
        }
    }
}
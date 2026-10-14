import java.util.ArrayList;
public class Deck
	{
		static ArrayList<Card> cardDeck = new ArrayList<>();
		
		public static void fillDeck()
		{
			cardDeck.add(new Card("Ace", "Hearts", 11,
				    "+---------+\n" +
				    "|A        |\n" +
				    "|    ♥    |\n" +
				    "|   ACE   |\n" +
				    "|    ♥    |\n" +
				    "|        A|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ace", "Diamonds", 11,
				    "+---------+\n" +
				    "|A        |\n" +
				    "|    ♦    |\n" +
				    "|   ACE   |\n" +
				    "|    ♦    |\n" +
				    "|        A|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ace", "Spades", 11,
				    "+---------+\n" +
				    "|A        |\n" +
				    "|    ♠    |\n" +
				    "|   ACE   |\n" +
				    "|    ♠    |\n" +
				    "|        A|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ace", "Clubs", 11,
				    "+---------+\n" +
				    "|A        |\n" +
				    "|    ♣    |\n" +
				    "|   ACE   |\n" +
				    "|    ♣    |\n" +
				    "|        A|\n" +
				    "+---------+"));

				cardDeck.add(new Card("King", "Hearts", 10,
				    "+---------+\n" +
				    "|K        |\n" +
				    "|    ♥    |\n" +
				    "|  KING   |\n" +
				    "|    ♥    |\n" +
				    "|        K|\n" +
				    "+---------+"));

				cardDeck.add(new Card("King", "Diamonds", 10,
				    "+---------+\n" +
				    "|K        |\n" +
				    "|    ♦    |\n" +
				    "|  KING   |\n" +
				    "|    ♦    |\n" +
				    "|        K|\n" +
				    "+---------+"));

				cardDeck.add(new Card("King", "Spades", 10,
				    "+---------+\n" +
				    "|K        |\n" +
				    "|    ♠    |\n" +
				    "|  KING   |\n" +
				    "|    ♠    |\n" +
				    "|        K|\n" +
				    "+---------+"));

				cardDeck.add(new Card("King", "Clubs", 10,
				    "+---------+\n" +
				    "|K        |\n" +
				    "|    ♣    |\n" +
				    "|  KING   |\n" +
				    "|    ♣    |\n" +
				    "|        K|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Queen", "Hearts", 10,
				    "+---------+\n" +
				    "|Q        |\n" +
				    "|    ♥    |\n" +
				    "|  QUEEN  |\n" +
				    "|    ♥    |\n" +
				    "|        Q|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Queen", "Diamonds", 10,
				    "+---------+\n" +
				    "|Q        |\n" +
				    "|    ♦    |\n" +
				    "|  QUEEN  |\n" +
				    "|    ♦    |\n" +
				    "|        Q|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Queen", "Spades", 10,
				    "+---------+\n" +
				    "|Q        |\n" +
				    "|    ♠    |\n" +
				    "|  QUEEN  |\n" +
				    "|    ♠    |\n" +
				    "|        Q|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Queen", "Clubs", 10,
				    "+---------+\n" +
				    "|Q        |\n" +
				    "|    ♣    |\n" +
				    "|  QUEEN  |\n" +
				    "|    ♣    |\n" +
				    "|        Q|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Jack", "Hearts", 10,
				    "+---------+\n" +
				    "|J        |\n" +
				    "|    ♥    |\n" +
				    "|  JACK   |\n" +
				    "|    ♥    |\n" +
				    "|        J|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Jack", "Diamonds", 10,
				    "+---------+\n" +
				    "|J        |\n" +
				    "|    ♦    |\n" +
				    "|  JACK   |\n" +
				    "|    ♦    |\n" +
				    "|        J|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Jack", "Spades", 10,
				    "+---------+\n" +
				    "|J        |\n" +
				    "|    ♠    |\n" +
				    "|  JACK   |\n" +
				    "|    ♠    |\n" +
				    "|        J|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Jack", "Clubs", 10,
				    "+---------+\n" +
				    "|J        |\n" +
				    "|    ♣    |\n" +
				    "|  JACK   |\n" +
				    "|    ♣    |\n" +
				    "|        J|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ten", "Hearts", 10,
				    "+---------+\n" +
				    "|10       |\n" +
				    "|    ♥    |\n" +
				    "|   TEN   |\n" +
				    "|    ♥    |\n" +
				    "|       10|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ten", "Diamonds", 10,
				    "+---------+\n" +
				    "|10       |\n" +
				    "|    ♦    |\n" +
				    "|   TEN   |\n" +
				    "|    ♦    |\n" +
				    "|       10|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ten", "Spades", 10,
				    "+---------+\n" +
				    "|10       |\n" +
				    "|    ♠    |\n" +
				    "|   TEN   |\n" +
				    "|    ♠    |\n" +
				    "|       10|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Ten", "Clubs", 10,
				    "+---------+\n" +
				    "|10       |\n" +
				    "|    ♣    |\n" +
				    "|   TEN   |\n" +
				    "|    ♣    |\n" +
				    "|       10|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Nine", "Hearts", 9,
				    "+---------+\n" +
				    "|9        |\n" +
				    "|    ♥    |\n" +
				    "|  NINE   |\n" +
				    "|    ♥    |\n" +
				    "|        9|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Nine", "Diamonds", 9,
				    "+---------+\n" +
				    "|9        |\n" +
				    "|    ♦    |\n" +
				    "|  NINE   |\n" +
				    "|    ♦    |\n" +
				    "|        9|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Nine", "Spades", 9,
				    "+---------+\n" +
				    "|9        |\n" +
				    "|    ♠    |\n" +
				    "|  NINE   |\n" +
				    "|    ♠    |\n" +
				    "|        9|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Nine", "Clubs", 9,
				    "+---------+\n" +
				    "|9        |\n" +
				    "|    ♣    |\n" +
				    "|  NINE   |\n" +
				    "|    ♣    |\n" +
				    "|        9|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Eight", "Hearts", 8,
				    "+---------+\n" +
				    "|8        |\n" +
				    "|    ♥    |\n" +
				    "|  EIGHT  |\n" +
				    "|    ♥    |\n" +
				    "|        8|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Eight", "Diamonds", 8,
				    "+---------+\n" +
				    "|8        |\n" +
				    "|    ♦    |\n" +
				    "|  EIGHT  |\n" +
				    "|    ♦    |\n" +
				    "|        8|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Eight", "Spades", 8,
				    "+---------+\n" +
				    "|8        |\n" +
				    "|    ♠    |\n" +
				    "|  EIGHT  |\n" +
				    "|    ♠    |\n" +
				    "|        8|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Eight", "Clubs", 8,
				    "+---------+\n" +
				    "|8        |\n" +
				    "|    ♣    |\n" +
				    "|  EIGHT  |\n" +
				    "|    ♣    |\n" +
				    "|        8|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Seven", "Hearts", 7,
				    "+---------+\n" +
				    "|7        |\n" +
				    "|    ♥    |\n" +
				    "|  SEVEN  |\n" +
				    "|    ♥    |\n" +
				    "|        7|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Seven", "Diamonds", 7,
				    "+---------+\n" +
				    "|7        |\n" +
				    "|    ♦    |\n" +
				    "|  SEVEN  |\n" +
				    "|    ♦    |\n" +
				    "|        7|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Seven", "Spades", 7,
				    "+---------+\n" +
				    "|7        |\n" +
				    "|    ♠    |\n" +
				    "|  SEVEN  |\n" +
				    "|    ♠    |\n" +
				    "|        7|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Seven", "Clubs", 7,
				    "+---------+\n" +
				    "|7        |\n" +
				    "|    ♣    |\n" +
				    "|  SEVEN  |\n" +
				    "|    ♣    |\n" +
				    "|        7|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Six", "Hearts", 6,
				    "+---------+\n" +
				    "|6        |\n" +
				    "|    ♥    |\n" +
				    "|   SIX   |\n" +
				    "|    ♥    |\n" +
				    "|        6|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Six", "Diamonds", 6,
				    "+---------+\n" +
				    "|6        |\n" +
				    "|    ♦    |\n" +
				    "|   SIX   |\n" +
				    "|    ♦    |\n" +
				    "|        6|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Six", "Spades", 6,
				    "+---------+\n" +
				    "|6        |\n" +
				    "|    ♠    |\n" +
				    "|   SIX   |\n" +
				    "|    ♠    |\n" +
				    "|        6|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Six", "Clubs", 6,
				    "+---------+\n" +
				    "|6        |\n" +
				    "|    ♣    |\n" +
				    "|   SIX   |\n" +
				    "|    ♣    |\n" +
				    "|        6|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Five", "Hearts", 5,
				    "+---------+\n" +
				    "|5        |\n" +
				    "|    ♥    |\n" +
				    "|  FIVE   |\n" +
				    "|    ♥    |\n" +
				    "|        5|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Five", "Diamonds", 5,
				    "+---------+\n" +
				    "|5        |\n" +
				    "|    ♦    |\n" +
				    "|  FIVE   |\n" +
				    "|    ♦    |\n" +
				    "|        5|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Five", "Spades", 5,
				    "+---------+\n" +
				    "|5        |\n" +
				    "|    ♠    |\n" +
				    "|  FIVE   |\n" +
				    "|    ♠    |\n" +
				    "|        5|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Five", "Clubs", 5,
				    "+---------+\n" +
				    "|5        |\n" +
				    "|    ♣    |\n" +
				    "|  FIVE   |\n" +
				    "|    ♣    |\n" +
				    "|        5|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Four", "Hearts", 4,
				    "+---------+\n" +
				    "|4        |\n" +
				    "|    ♥    |\n" +
				    "|  FOUR   |\n" +
				    "|    ♥    |\n" +
				    "|        4|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Four", "Diamonds", 4,
				    "+---------+\n" +
				    "|4        |\n" +
				    "|    ♦    |\n" +
				    "|  FOUR   |\n" +
				    "|    ♦    |\n" +
				    "|        4|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Four", "Spades", 4,
				    "+---------+\n" +
				    "|4        |\n" +
				    "|    ♠    |\n" +
				    "|  FOUR   |\n" +
				    "|    ♠    |\n" +
				    "|        4|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Four", "Clubs", 4,
				    "+---------+\n" +
				    "|4        |\n" +
				    "|    ♣    |\n" +
				    "|  FOUR   |\n" +
				    "|    ♣    |\n" +
				    "|        4|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Three", "Hearts", 3,
				    "+---------+\n" +
				    "|3        |\n" +
				    "|    ♥    |\n" +
				    "|  THREE  |\n" +
				    "|    ♥    |\n" +
				    "|        3|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Three", "Diamonds", 3,
				    "+---------+\n" +
				    "|3        |\n" +
				    "|    ♦    |\n" +
				    "|  THREE  |\n" +
				    "|    ♦    |\n" +
				    "|        3|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Three", "Spades", 3,
				    "+---------+\n" +
				    "|3        |\n" +
				    "|    ♠    |\n" +
				    "|  THREE  |\n" +
				    "|    ♠    |\n" +
				    "|        3|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Three", "Clubs", 3,
				    "+---------+\n" +
				    "|3        |\n" +
				    "|    ♣    |\n" +
				    "|  THREE  |\n" +
				    "|    ♣    |\n" +
				    "|        3|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Two", "Hearts", 2,
				    "+---------+\n" +
				    "|2        |\n" +
				    "|    ♥    |\n" +
				    "|   TWO   |\n" +
				    "|    ♥    |\n" +
				    "|        2|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Two", "Diamonds", 2,
				    "+---------+\n" +
				    "|2        |\n" +
				    "|    ♦    |\n" +
				    "|   TWO   |\n" +
				    "|    ♦    |\n" +
				    "|        2|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Two", "Spades", 2,
				    "+---------+\n" +
				    "|2        |\n" +
				    "|    ♠    |\n" +
				    "|   TWO   |\n" +
				    "|    ♠    |\n" +
				    "|        2|\n" +
				    "+---------+"));

				cardDeck.add(new Card("Two", "Clubs", 2,
				    "+---------+\n" +
				    "|2        |\n" +
				    "|    ♣    |\n" +
				    "|   TWO   |\n" +
				    "|    ♣    |\n" +
				    "|        2|\n" +
				    "+---------+"));
		}
	}

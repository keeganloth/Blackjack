
public class Card
	{
		private String suit;
		private String rank;
		private int value;
		private String art;
		
		 public Card() 
			{
				
		    }
		 public Card(String rank, String suit, int value, String art) 
			{
		        this.suit = suit;
		        this.rank = rank;
		        this.value = value;
		        this.art = art;
		 	}
		 public String getSuit()
			 {
				 return suit;
			 }
		 public void setSuit(String suit)
			 {
				 this.suit = suit;
			 }
		 public String getRank()
			 {
				 return rank;
			 }
		 public void setRank(String rank)
			 {
				 this.rank = rank;
			 }
		 public int getValue()
			 {
				 return value;
			 }
		 public void setValue(int value)
			 {
				 this.value = value;
			 }
		 public String getArt()
			 {
				 return art;
			 }
		 public void setArt(String art)
			 {
				 this.art = art;
			 }
		 
		 
	}

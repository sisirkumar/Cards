import java.util.Arrays;
public class Cards {
	    String Card1;
	    String Card2;
	    String Card3;
	    String Card4;
	    String Card5;

	    String deck[] = new String[100];
    	String[] suits = {"C","D","H","S"};
    	String[] ranks ={"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
	    public Cards(String c1,String c2,String c3,String c4,String c5) {
	    Card1 = c1;
	    Card2 = c2;
		Card3 = c3;
		Card4 = c4;
		Card5 = c5;
	    }
	    public void cardstoDigits() {
	    	for(int i=0;i<52;i++){
	    		deck[i]=suits[i/13]+ranks[i%13];
	    	}
	    }
	    public int[] cardToSeq(){
	    	int seq[] = new int[10];
	    	seq[0]=Arrays.asList(deck).indexOf(Card1);
	    	seq[1]=Arrays.asList(deck).indexOf(Card2);
	    	seq[2]=Arrays.asList(deck).indexOf(Card3);
	    	seq[3]=Arrays.asList(deck).indexOf(Card4);
	    	seq[4]=Arrays.asList(deck).indexOf(Card5);
	    	return seq;
	    }
	    public boolean isStraight(int[] straigcardst){
	    	int c = 0;
	    	Arrays.sort(straigcardst);
	    	for(int i=0;i<4;i++){
	    		if(straigcardst[i]==straigcardst[i+1]-1)
	    			c++;
	    	}
	    		return c==5;
	    }
	    public boolean isFouraKind(int cards[]) {
			Arrays.sort(cards);
			boolean a1 = cards[0]%13 == cards[1]%13 && cards[1]%13 == cards[2]%13 && cards[2]%13 == cards[3]%13;
			boolean a2 = cards[1]%13== cards[2]%13&& cards[2]%13 == cards[3]%13 && cards[3]%13 == cards[4]%13;
			return (a1||a2);
	   }
	    public boolean isFullcard(int cards[]){
	    	Arrays.sort(cards);
	    	boolean a1 = cards[0]%13 == cards[1]%13 && cards[1]%13 == cards[2]%13 && cards[3]%13 == cards[4]%13;
	    	boolean a2 = cards[0]%13 == cards[1]%13 && cards[2]%13 == cards[3]%13 && cards[3]%13 == cards[4]%13;
	    	return (a1||a2);
	    }
	    public boolean isThreeaKind( int cards[]){
	    	Arrays.sort(cards);
	    	boolean a1 = cards[0]%13 == cards[1]%13 && cards[1]%13 == cards[2]%13 && cards[3]%13 != cards[0]%13 && cards[4]%13 != cards[0]%13 && cards[3]%13 != cards[4]%13;
	    	boolean a2 = cards[1]%13 == cards[2]%13 && cards[2]%13 == cards[3]%13 && cards[0]%13 != cards[1]%13 && cards[4]%13 != cards[1]%13 && cards[0]%13 != cards[4]%13;
	    	boolean a3 = cards[2]%13 == cards[3]%13 && cards[3]%13 == cards[4]%13 && cards[0]%13 != cards[2]%13 && cards[1]%13 != cards[2]%13 && cards[0]%13 != cards[1]%13;
	    	return(a1||a2||a3);
	    }
	    public boolean isOnePair(int cards[]) {
			Arrays.sort(cards);
			boolean a1 = cards[0]%13 == cards[1]%13 ;
			boolean a2 = cards[1]%13 == cards[2]%13;
			boolean a3 = cards[2]%13 == cards[3]%13; 
			boolean a4 = cards[3]%13 == cards[4]%13;
			return(a1||a2||a3||a4);
	   }
	    public boolean isTwoPair(int cards[]) {
			Arrays.sort(cards);
			boolean a1 = cards[0]%13 == cards[1]%13 && cards[2]%13 == cards[3]%13;
			boolean a2 = cards[1]%13 == cards[2]%13 && cards[3]%13 == cards[4]%13;
			boolean a3 = cards[0]%13 == cards[1]%13 && cards[3]%13 == cards[4]%13;
			return (a1||a2||a3);
	   }
	    public boolean highCard(int cards[]) {
			Arrays.sort(cards);
			boolean a1 = cards[0]%13 != cards[1]%13 && cards[1]%13 != cards[2]%13 && cards[2]%13 != cards[3]%13 && cards[3]%13 != cards[4]%13;
			System.out.println(cards[4]);
			return (a1);
	   }
	    
	}


 
	  

 

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
	    public String compare() {
	    	for(int i=0;i<52;i++){
	    		deck[i]=suits[i/13]+ranks[i%13];
	    	}

	    	if(Arrays.asList(deck).indexOf(Card1)>Arrays.asList(deck).indexOf(Card2))
	    		return deck[Arrays.asList(deck).indexOf(Card1)];
	    	else
	    		return deck[Arrays.asList(deck).indexOf(Card2)];
	    
	    }
	    public int[] cardToRank(){
	    	int ranks[] = new int[10];
	    	ranks[0]=Arrays.asList(deck).indexOf(Card1);
	    	ranks[1]=Arrays.asList(deck).indexOf(Card2);
		ranks[2]=Arrays.asList(deck).indexOf(Card3);
		ranks[3]=Arrays.asList(deck).indexOf(Card4);
		ranks[4]=Arrays.asList(deck).indexOf(Card5);
	    	return ranks;
	    }
	    public int s(int[] straight){
	    	int c = 0;
	    	Arrays.sort(straight);
	    	for(int i=0;i<4;i++){
	    		if(straight[i]==straight[i+1]-1)
	    			c++;
	    	}
	    	if(c==5)
	    		return 1;
	    	return 0;
	    }

}


 

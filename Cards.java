import java.util.Arrays;
public class Cards {
	    String Card1;
	    String Card2;
	    public Cards(String c1,String c2) {
	    	Card1 = c1;
	    	Card2 = c2;
	    }
	    public String compare() {
	    	String dech[] = new String[100];
	    	String[] suits = {"C","D","H","S"};
	    	String[] pips ={"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
	    	for(int i=0;i<52;i++){
	    		dech[i]=suits[i/13]+pips[i%13];
	    	}
	    	if(Arrays.asList(dech).indexOf(Card1)>Arrays.asList(dech).indexOf(Card2))
	    		return dech[Arrays.asList(dech).indexOf(Card1)];
	    	else
	    		return dech[Arrays.asList(dech).indexOf(Card2)];
	    
	    }

}


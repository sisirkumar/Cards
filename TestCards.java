
public class CardTest {
	public static void main(String args[]) {
    	Cards c = new Cards("HQ","Hk");
    	System.out.println(c.compare());
    	int a[] =c.cardToRank();
    	int rank1 = c.s(a);
    	System.out.println(rank1);
    }
}


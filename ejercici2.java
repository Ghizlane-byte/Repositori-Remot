package activitat5;

public class ejercici2 {

	public int sou;
	private int edat;
	
	public ejercici2(int losou) {
		sou = losou;
	}
	
	private boolean EsBo() {
		return true;
	}
	
	private boolean NoEsBo()	{
		return false;
	}
	
	public boolean EsBonEmpleat (int problema) {
		if (problema == 0) {
			return true;
		} else if (problema < 3) {
			if (sou < 500) {
				return EsBo();
			} else { 
				return NoEsBo();
		} 
		} else if(problema >= 3) {
			return NoEsBo();
		} else {
			return false;
		}
	}
}

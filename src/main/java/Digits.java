import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	digitList = new ArrayList <>();
	if(num == 0)
		digitList.add(0);
	while(num > 0){
		digitList.add(d1%10);
		d1 = d1/10;
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		boolean inc = true;
		for(int i = 0; i < digitList.size()-1;i++)
			if(digitList.get(i) >= digitList.get(i+1))
				inc = false;
		return inc;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}

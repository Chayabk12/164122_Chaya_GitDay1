package app;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class main_collect_bank implements Comparator <BankAccount>
{
	public static void main(String [] args)
	{
		Set <BankAccount>t1= new TreeSet(new main_collect_bank());
		t1.add(new BankAccount("chaya",235455,12));
		t1.add(new BankAccount("ciya",455,26));
		t1.add(new BankAccount("priya",45,6));
		t1.add(new BankAccount("priya",45,6));
		t1.add(new BankAccount("Madhu",  58486845,  56));
		
 for (BankAccount b: t1)
 {
	 System.out.println(b);
 }
	}

	@Override
	public int compare(BankAccount b1, BankAccount b2)
	{
		if(b1.getId()==b2.getId())
			return 0;
		else if(b1.getId()>b2.getId())
		{
		return 1;
	}
		else 
			return -1;
	}
}

package session9;

import java.util.Comparator;

public class CompareDesgination implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getDesignation().compareTo(o2.getDesignation())>0){
			return 1;
		}
		else if(o1.getDesignation().compareTo(o2.getDesignation())<0){
			 return -1;
		}
		else{
		return 0;
	   }
	}

}

package leapyear;

public class LeapYear {

	public boolean isLeap(int year) {
		
		if (isMultipleOf400(year))
		   return true;
		else if (isMultipleOf100(year))
		   return false;
		else if (isMultipleOf4(year))
		   return true;
		
	}

	private boolean isMultipleOf400(int i) {
		return isMultipleOf(i, 400);
	}
	
	private boolean isMultipleOf100(int i) {
		return isMultipleOf(i, 100);
	}
	
	private boolean isMultipleOf4(int i) {
		return isMultipleOf(i, 4);
	}
	
	private boolean isMultipleOf(int num, int base) {
		return ((num % base) == 0);
	}
	
}

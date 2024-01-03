

import java.io.*;
import java.util.Calendar;
import java.util.*;
public class Main {


	public static void main(String[] args) {
		 
		Calendar rightNow = Calendar.getInstance();
		System.out.println(Calendar.DAY_OF_WEEK);


		// Calendar cal = Calendar();
		// set(year, month, date)
		// rightNow.set(2017, 7, 15);
		// System.out.println(rightNow.DAY_OF_WEEK);
		
		Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,8-1);
        cal.set(Calendar.DAY_OF_MONTH,14);
        cal.set(Calendar.YEAR,2017);
		String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        
		System.out.println(cal.DAY_OF_WEEK);

	}
}
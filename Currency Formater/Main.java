

import java.text.NumberFormat;
import java.util.Locale;

class Main {
	public static void main(String[] args) {
		
		System.out.println(NumberFormat.getInstance().format(12324.134));
		NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
		System.out.println(nf.format()	);
	}	
}


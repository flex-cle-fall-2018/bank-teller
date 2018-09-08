package bankteller;

import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimalDemo {

	public static void main(String[] args) {
//		BigDecimal bd = new BigDecimal(0);
//		
//		bd = bd.add(new BigDecimal(10));
//		bd = bd.divide(new BigDecimal(2));
//		bd = bd.multiply(new BigDecimal(3));
//		bd = bd.subtract(new BigDecimal(7));
//		
//		MathContext mc = new MathContext(2);
//		bd = bd.remainder(new BigDecimal(5), mc);
//		
//		System.out.println(bd);
		
		
		BigDecimal bdA = new BigDecimal("7.2341");
		BigDecimal bdB = new BigDecimal("7.2341");
		
		if (bdA.compareTo(bdB) > 0) {
			System.out.println("bdA is largest");
		} else if (bdA.compareTo(bdB) < 0) {
			System.out.println("bdB is largest");
		} else {
			System.out.println("They're the same.");
		}
	}

}

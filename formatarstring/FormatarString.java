package formatarstring;

public class FormatarString {

	public static void main(String[] args) {
		
		String original =  "abcde FGHIJ ABC abc DEFG      ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 9);
		String s6 = original.replace('a', 'x');
		String s7 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println("Original: - "+original+" - ");
		System.out.println("To lower case: - "+s1+" - ");
		System.out.println("To upper case: - "+s2+" - ");
		System.out.println("Trim: - "+s3+" - ");
		System.out.println("Substring(2) : - "+s4+" - ");
		System.out.println("Substring(2, 9) : - "+s5+" - ");
		System.out.println("Replace : - "+s6+" - ");
		System.out.println("Replace : - "+s7+" - ");
		System.out.println("indexOf : - "+i+" - ");
		System.out.println("lastIndexOf : - "+j+" - ");
		System.out.println("Vect[0] : - "+vect[0]+" - ");
		System.out.println("Vect[1] : - "+vect[1]+" - ");
		System.out.println("Vect[2] : - "+vect[2]+" - ");

	}

}

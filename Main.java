
public class Main {
	public static void main (String args[]) {
        Complex complex1 = new Complex (1,2);
        Complex complex2 = new Complex (2,4);
        System.out.println(complex1);
        System.out.println(complex2);
        
        Complex complex3 = Complex.multiply(complex2, complex1);
        System.out.println(complex3);

        
	}
}

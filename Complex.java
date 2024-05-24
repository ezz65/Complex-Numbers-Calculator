
public class Complex {
    private double x;
    private double y;
    Complex (double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return new String ("(" + this.x +" + " +this.y+" i)");
    }
    static Complex add(Complex a, Complex b) {
        return new Complex ( (a.x+b.x) , (a.y+b.y) );
    }
    static Complex subtract(Complex a, Complex b) {
        return new Complex ( (a.x-b.x) , (a.y-b.y) );
    }
    static Complex multiply(Complex a, Complex b) {
        return new Complex ( (a.x*b.x-a.y*b.y) , (a.x*b.y+a.y*b.x) );
    }
    static Complex divide(Complex a, Complex b) {
        double realpart = (a.x*b.x+b.y*a.y)/(b.x*b.x+b.y*b.y);
        double imaginarypart = (b.x*a.y-a.x*b.y)/(b.x*b.x+b.y*b.y);
        return new Complex ( realpart , imaginarypart );
    }
    static Complex sqrt(Complex a) {
        
        return new Complex (1,2);
    }
    
    
}

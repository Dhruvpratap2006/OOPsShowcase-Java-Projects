public class Main {
    public static void main(String[] args) {
        Complex c = new Complex(2 , 3);
        Complex d = new Complex(64 , 48);
       
        Complex sum = Complex.add(c,d);
        sum.printComplex();
        
        Complex diff = Complex.diff(c,d);
        diff.printComplex();
        
        Complex mult = Complex.mult(c,d);
        mult.printComplex();
    }
}

class Complex {
    int real;
    int imag;
    
    Complex(int real , int imag) {
        this.real = real;
        this.imag = imag;
    }
    
   public static Complex add(Complex a , Complex b) {
       return new Complex((a.real + b.real) , (a.imag + b.imag));
   }
    
    public static Complex diff(Complex a , Complex b) {
        return new Complex((a.real - b.real) , (a.imag - b.imag));
    }
    
    public static Complex mult(Complex a , Complex b) {
        return new Complex(
    (a.real * b.real - a.imag * b.imag), 
    (a.real * b.imag + a.imag * b.real)
);
    }
    
    public void printComplex() {
        if(real == 0 && imag != 0) {
            System.out.println(imag + "i");
        }
        else if(real != 0 && imag == 0) {
             System.out.println(real);
        }
        else {
             System.out.println(real + " + " + imag + "i");
        }
    }
}

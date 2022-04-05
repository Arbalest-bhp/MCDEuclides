//Euclides Main for MCD Algorithm

public class EuclidesMain{
	public static void main(String[] args)
    {
    	EuclidesMCD calculador = new EuclidesMCD();

        int a = 10, b = 15, m = calculador.gcd(a,b);
        System.out.println("MCD(" + a +  " , " + b+ ") = " + m);
         
        a = 35; b = 10;
        m = calculador.gcd(a,b);
        System.out.println("MCD(" + a +  " , " + b+ ") = " + m);
         
        a = 31; b = 2;
        m = calculador.gcd(a,b);
        System.out.println("MCD(" + a +  " , " + b+ ") = " + m);
 
    }
}
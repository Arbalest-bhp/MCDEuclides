//EuclidianMCD
//Recursive Method

public class EuclidesMCD{
	public int gcd(int a, int b){
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
}

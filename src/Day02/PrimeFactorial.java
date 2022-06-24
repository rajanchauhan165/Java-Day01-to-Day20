package Day02;

public class PrimeFactorial {
    static void primefact(int num){
        if(num<2){
            System.out.println("Enter Number Greater Than 2");
        }else {
            for(int i=1; i<=num; i++){
                if(num%i == 0){
                    System.out.println(i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        primefact(12);
    }
}

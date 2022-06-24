package Day02;

public class SumOfNaturalNumbers {
    static void sumOfN(int a){
        if(a<1){
            System.out.println("Enter a valid Natural Number");
        }
        else {
            System.out.println((a*(a+1))/2);
        }
    }

    public static void main(String[] args) {
        sumOfN(10);
    }
}

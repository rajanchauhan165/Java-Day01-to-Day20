package Day02;

public class CricketScore {
    static void cricketscore(int NoOfones, int NoOftwos, int NoOfthrees, int NoOffours, int NoOfSixex){
        int one = NoOfones*1;
        int two = NoOftwos*2;
        int three = NoOfthrees*3;
        int four = NoOffours*4;
        int six = NoOfSixex*6;
        System.out.println("Total runs: "+(one+two+three+four+six));
    }

    public static void main(String[] args) {
        cricketscore(5,10,2,5,4);
    }
}

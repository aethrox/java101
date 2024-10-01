import java.util.Scanner;

class Result {
    String smallNum, medianNum, bigNum;

    public void sortNumbers(){
        System.out.printf("%s > %s > %s%n", bigNum, medianNum, smallNum);
    }
}

public class KucuktenBuyugeSirala {
    public static void main(String[] args) {
        Result result = new Result();
        Scanner input = new Scanner(System.in);

        System.out.print("A sayısı: ");
        int a = input.nextInt();

        System.out.print("B sayısı: ");
        int b = input.nextInt();

        System.out.print("C sayısı: ");
        int c = input.nextInt();

        if (a > b && a > c){
            result.bigNum = "A";
            if(b > c) {
                result.medianNum = "B";
                result.smallNum = "C";
            } else {
                result.medianNum = "C";
                result.smallNum = "B";
            }
        } else {
            if (b > a && b > c) {
                result.bigNum = "B";
                if (a > c) {
                    result.medianNum = "A";
                    result.smallNum = "C";
                } else {
                    result.medianNum = "C";
                    result.smallNum = "A";
                }
            } else {
                result.bigNum = "C";
                if (a > b){
                    result.medianNum = "A";
                    result.smallNum = "B";
                } else {
                    result.medianNum = "B";
                    result.smallNum = "A";
                }
            }
        }
        result.sortNumbers();
    }
}

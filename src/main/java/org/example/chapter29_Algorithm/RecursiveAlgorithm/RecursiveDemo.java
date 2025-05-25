package org.example.chapter29_Algorithm.RecursiveAlgorithm;

public class RecursiveDemo {
    public static void main(String[] args) {

    //1到n的累加求和
    int GivenNumber = 100;
    int result = addWay(GivenNumber);
    System.out.println(result);
    System.out.println(AddWay(1,GivenNumber));
    System.out.println(Way1(10));

    }

    private static int addWay(int givenNumber) {
        int number = 0;
        for (int i = 1; i <=givenNumber; i++) {
            number+=i;
        }
        return number;
    }

    public static int AddWay(int a ,int givenNumber) {
        if (a == givenNumber){
            return a;
        }else {
            return a + AddWay(a+1,givenNumber);
        }
    }

    public static int AddWay1(int givenNumber) {
        if (givenNumber == 1){
            return 1;
        }else {
            return givenNumber+AddWay1(givenNumber-1);
        }
    }

    public static int Way1(int givenNumber) {
        if (givenNumber == 1){
            return 1;
        }else {
            return givenNumber*Way1(givenNumber-1);
        }
    }

}

public class h3 {
    public static void main(String[] args) {
        int num = 154;
        int reversenum = 0;
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        System.out.println("реверс номер: " + reversenum);

    }
}

//    int sum = 1;
//    int previousNumber = 0;
//    int nextNumber = 1;
//        for (int i = 1; i < n; i++) {
//        sum = previousNumber + nextNumber;
//        previousNumber = nextNumber;
//        nextNumber = sum;





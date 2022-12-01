import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
//bài4
        int tong = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 ==0 ) {
              tong += i;
            }

        }
        System.out.println("Tổng các số chia hết cho 5: "+tong);


//    bài 5


            float bankinh;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập vào bán kính:");
            bankinh =  scanner.nextFloat();

            final float PI = 3.14f;

            float theTich = 4%3 * PI * bankinh * bankinh;

            System.out.println(theTich);
//bài 6
        for(int i = 0; i <= 100; i++){
            if (i % 3 ==0){
                System.out.println("Fizz");
                continue;
            }
            if (i% 5 ==0){
                System.out.println("Buzz");
                continue;
            }
            if ((i % 3 ==0) && (i % 5 ==0)) {
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);

        }

    }


}
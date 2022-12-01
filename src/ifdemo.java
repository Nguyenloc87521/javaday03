public class ifdemo {
    public static void main(String[] args) {
//        kết hợp nhiều đk thì ta có toán tử và,hoặc, phủ định

//
        int hour = 6;
        if (hour < 10) {
            System.out.println("Good morning!");

        } else if (hour >= 12 && hour < 18) {
            System.out.println("goog afternoon");
        } else {
            System.out.println("good evening");}

            boolean troidep = true;
            boolean cotien = true;
            if (troidep && cotien) {
                System.out.println(" đi chơi");
            }
            if (troidep || cotien) {
                System.out.println("đi chơi lần 2");
            }
//            toán tử 3 ngôi
            String messages = (troidep && cotien) ? "đi chơi " : "ở nhà";
            System.out.println(messages);

            int number = 12;
            String text = number > 0 ? " Số dương" : number == 0 ? "số dương" : "số âm";
            System.out.println(text);


        }

    }

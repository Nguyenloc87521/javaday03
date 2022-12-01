public class btvn {
    public static void main(String[] args) {
//        câu 1:
        System.out.println(repeatString("a"));
//câu2:
        System.out.println(repeatString1("a"+"-"));
//câu 3
        System.out.println(repeatString2("a", 5));
//        câu 4

    }

    public static String repeatString(String str) {
        String rs = "";
        for (int i = 0; i < 10; i++) {
            rs += str;

        }
        return rs;
    }

    public static String repeatString1(String str){
        String rs = "";
        for (int i = 0; i < 10; i++) {
            rs += str;

        }
        return rs;
    }
    public static String repeatString2(String str, int count) {
        String rs = "";
        for (int i = 0; i < count; i++) {
            rs += str;
        }
        return rs;
    }
}

package lesson_7;

public class lesson_7 {
    public static void main(String[] args) {
        String myString = "Hello";
        myString = myString.concat("World");
        myString = myString + "!";
        System.out.println(myString);

        String hello = "Hello World";
        int len = hello.length();
        int stringLength = hello.length();
        System.out.println(len);

        String greet = " How ".trim();
        System.out.println(greet);

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");
        System.out.println("index of first dash: " + idx1);
    }

}

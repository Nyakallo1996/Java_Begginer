package ex_07_02;

public class stringbuilder {
    public static void main(String[] args) {
        //String customName = "Nyakallo Mahlakametsa";
        String firstName = "Nyakallo ";
        StringBuilder sb;
        sb = new StringBuilder(firstName);

        sb.append(" Mahlakametsa");

        System.out.println(sb);
    }
}

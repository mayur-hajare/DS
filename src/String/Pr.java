package String;


class PrString {
    public void pr1() {
//        int a = 10;
//        String str = "Mayur";
//        System.out.println(String.join("_", "", str, str));
//        System.out.println(str);
//        char[] chars = str.toCharArray();
//        System.out.println(chars);
//        System.out.println(chars[1]);
//        System.out.println("Int: " + a);
//        String s = String.valueOf(a);
//        System.out.println("String: " + s);
//        System.out.println(s.getClass());

        StringBuffer sb = new StringBuffer("Mayur");
        //StringBuffer sb1 = new StringBuffer("Hajare");
        StringBuffer sb1 = new StringBuffer("Mayur");
        System.out.println(sb.charAt(2));
        System.out.println(sb.append(" Hajare"));
//        System.out.println(sb.indexOf("a"));
//        System.out.println(sb.lastIndexOf("a"));
//        System.out.println(sb.delete(3, 8));
//        System.out.println(sb.deleteCharAt(2));
        // equals method not used in SB bcz equal method inherited from Object Class. and its check reference of objects
        // sb1 = sb.append("Hello");
        System.out.println(sb.equals(sb1));
        System.out.println(sb.equals(sb1));
        System.out.println(sb.insert(6, "Santosh"));

    }
}

public class Pr {
    public static void main(String[] args) {
        PrString pr = new PrString();
        pr.pr1();

    }
}

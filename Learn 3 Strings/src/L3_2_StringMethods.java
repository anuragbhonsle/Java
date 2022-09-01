public class L3_2_StringMethods {
    public static void main(String[] args) {
    String name = "PewDiePie";
    int value = name.length();
        System.out.println(value);
        String value2 = name.toLowerCase();
        System.out.println(value2);
        String value3 = name.toUpperCase();
        System.out.println(value3);
        System.out.println(name.substring(2));
        System.out.println(name.replace('P','N'));
        System.out.println(name.startsWith("Pew"));
        System.out.println(name.endsWith("Pie"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf('D'));
    }
}

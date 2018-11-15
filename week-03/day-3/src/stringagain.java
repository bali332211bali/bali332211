public class stringagain {

    private static String str(String str) {
        if (str.contains("x")) {
            if (str.length() > 1) {
                str.replaceFirst("x", "");
                return str(str.substring(str.indexOf("x")-1, str.length()-1)) + str(str.substring(0, str.indexOf("x")));
            }
        }
        return str;
    }






    public static void main(String[] args) {

        System.out.println(str("sxxsxx"));
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    }
}

public class string {

    private static String str(String str) {
        if (str.length() > 1) {
            if (str.charAt(str.length() - 1) == 'x') {
                return str(str.substring(0, str.length() - 1)) + "y";
            } else if (str.charAt(str.length() - 1) == 'y') {
                return str(str.substring(0, str.length() - 1)) + "x";
            } else {
                return str(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
            }
        }

        if (str.charAt(str.length()-1) == 'x') {
            return "y";
        } else if (str.charAt(str.length()-1) == 'y') {
            return "x";
        } else {
            return str;
        }



    }


    public static void main(String[] args) {
        String s = "bbxxxxyyyyaa";

        System.out.println(str(s));


        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.
    }
}

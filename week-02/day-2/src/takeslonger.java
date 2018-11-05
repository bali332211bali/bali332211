public class takeslonger {
    public static void main(String[] args) {




        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        System.out.println(quote.indexOf("It"));
        quote.insert(21, "always takes longer than ");

        System.out.println(quote);





        StringBuilder quote2 = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        System.out.println(quote2.substring(0,21) + "always takes longer than " + quote2.substring(21,quote2.length()));

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

    }
}

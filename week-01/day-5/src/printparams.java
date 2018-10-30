public class printparams {

    public static void printParams(String... args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }



    public static void main(String[] args) {

        printParams("first", "second");
    }




// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...
}
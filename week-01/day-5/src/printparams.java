public class printparams {

    public static void printParams(String... end) {
        for (String start : end) {
            System.out.print(start + " ");
        }
    }

    public static int sum(int... end) {
        int sumAll = 0;
        for (int start : end) {
            sumAll += start;
        }
        return sumAll;
    }


    public static void main(String[] args) {


        System.out.println(sum(3,4,5));


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
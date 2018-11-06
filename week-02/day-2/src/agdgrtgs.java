import java.util.*;

public class agdgrtgs {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("dsagsdg");
        list.add("dsags");
        list.add("dsdg");
        list.add(0,"asdgfs");

        list.set(0, "dsgaiojgragrg");
        System.out.println(list);

        List<String> str = Arrays.asList("stsrt", "sdggad");
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("dsfasdg", "sdfagdgs"));

        List<Integer> numbers = Arrays.asList(3, 4, 5);
        numbers.set(1,numbers.get(1) + 1);


        String str4 = "sadjikofdgadsafragt";
        String[] str4Split = str4.split("a");

        for (String str5 : str4Split){
            System.out.println(str5);
        }
        System.out.println();


        HashMap<Integer, String> days = new HashMap<>();
        days.put(1, "Monday");
        days.put(2, "Tuesday");
        days.put(3, "Wednesday");

        System.out.println(days);

        System.out.println(days.get(2));


        for (int key: days.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<Integer, String> entry: days.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }



    }


}

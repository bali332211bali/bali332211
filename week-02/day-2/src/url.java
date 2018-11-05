

import java.lang.*;


public class url {
    public static void main(String[] args) {


        String url = "https//www.reddit.com/r/nevertellmethebots";
        String replaced = url.replace("bots", "odds");

        StringBuffer inserted = new StringBuffer(replaced);
        inserted.insert(5, ':');

        System.out.println(inserted);




        String url3 = "https//www.reddit.com/r/nevertellmethebots";
        String replaced3 = url3.replace("bots", "odds");

        StringBuilder inserted3 = new StringBuilder(replaced3);
        inserted3.insert(5, ':');

        System.out.println(inserted3);





        String url2 = "https//www.reddit.com/r/nevertellmethebots";
        String replaced2 = url2.replace("https//www.reddit.com/r/nevertellmethebots", "https://www.reddit.com/r/nevertellmetheodds");

        System.out.println(replaced2);



        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

    }
}

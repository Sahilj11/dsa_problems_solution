/**
 * TwitterMain
 */
public class TwitterMain {

    public static void main(String[] args) {
        Twitter twe = new Twitter();
        twe.postTweet(1, 5);
        System.out.println(twe.getTweetFeed(1).toString());
        twe.postTweet(1, 3);
        twe.follow(1, 2);
        twe.postTweet(2, 6);
        System.out.println(twe.getTweetFeed(1).toString());
        twe.unfollow(1, 2);
        System.out.println(twe.getTweetFeed(1).toString());
    }
    
}

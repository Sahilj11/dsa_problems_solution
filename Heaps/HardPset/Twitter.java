import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Twitter
 */
public class Twitter {

    private HashMap<Integer, Integer> tweets;
    private HashMap<Integer, List<Integer>> followData;

    public Twitter() {
        this.tweets = new LinkedHashMap<>();
        this.followData = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (tweets.isEmpty()) {
            tweets.put(userId, tweetId);
        } else if (tweets.containsValue(tweetId))
            return;
        tweets.put(userId, tweetId);
    }

    public List<Integer> getTweetFeed(int userId) {
        // max limit is 10
        // recent user tweet and user following tweets
        // for loop for size tweets and check every tweet
        List<Integer> recentTweets = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(tweets.entrySet());

        int numTweet = 0;
        for (int i = entry.size() - 1; i >= 0; i--) {
            if (numTweet > 10) {
               return recentTweets; 
            }
            Map.Entry<Integer, Integer> element = entry.get(i);
            if (element.getKey() == userId || followData.get(userId).contains(element.getKey())) {
                recentTweets.add(element.getValue());
                numTweet++;
            } 
        }
        return recentTweets;
    }

    public void follow(int followerId, int followeeId) {
        if (followData.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(followeeId);
            followData.put(followerId, list);
        } else {
            followData.get(followerId).add(followeeId);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if (followData.isEmpty()) {
            return;
        } else {
            Integer unfollowId = followeeId;
            followData.get(followerId).remove(unfollowId);
        }
    }
}

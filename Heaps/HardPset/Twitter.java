import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Twitter
 */
public class Twitter {
    HashMap<Integer, List<Integer>> tweets;
    HashMap<Integer, List<Integer>> followData;

    // TODO: do it later
    public Twitter() {
        this.tweets = new HashMap<>();
        this.followData = new HashMap<>();
    }

    void postTweet(int userId, int tweetId) {
        if (tweets.containsKey(userId)) {
            if (tweets.get(userId).contains(tweetId)) {
                return;
            } else {
                tweets.get(userId).add(tweetId);
            }
        } else {
            tweets.put(userId, List.of(tweetId));
        }
    }

    List<Integer> getNewsFeed(int userId) {

    }

    void unfollow(int followerId, int followeeId) {
        if (followData.containsKey(followerId)) {
            if (!followData.get(followerId).isEmpty()) {
                followData.get(followerId).remove(followeeId);
            } else {
                return;
            }
        }
    }

    void follow(int followerId, int followeeId) {
        if (followData.containsKey(followerId)) {
            followData.get(followerId).add(followeeId);
        } else {
            followData.put(followerId, List.of(followeeId));
        }
    }
}

package DSA.StackAndQueue.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Twitter {

    List<Tweet> tweets ; // <user, list of tweets>

    HashMap<Integer, User> allUserTweets ; // <user, list of tweets>


    public Twitter() {
      tweets = new ArrayList<>();
        allUserTweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
         if(!allUserTweets.containsKey(userId))
             allUserTweets.put(userId, new User(userId));
        tweets.add(new Tweet(userId, tweetId));
      tweets.stream().forEach(tweet -> System.out.println("Tweet : " + tweet.getTweetId() + " UserId: " + tweet.getUserId()));
    }

    public void follow(int followerId, int followeeId) {
     if(!allUserTweets.containsKey(followerId)) {
         allUserTweets.put(followerId, new User(followerId));
     }
    User users = allUserTweets.get(followerId);
    users.fallows.add(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {
        if(!allUserTweets.containsKey(followerId)) {
            allUserTweets.get(followerId).fallows.remove(followeeId);
        }
        User user = allUserTweets.get(followerId);
        user.fallows.remove(followeeId);
    }

    public List<Integer> getNewsFeed(int userId) {
        if(!allUserTweets.containsKey(userId))
            allUserTweets.put(userId, new User(userId));
        List<Integer> ans = new ArrayList<Integer>();
        int i = tweets.size()-1;
        while(ans.size()<10 && i>=0) {
            if(tweets.get(i).userId==userId || allUserTweets.get(userId).fallows.contains(tweets.get(i).userId))
                ans.add(tweets.get(i).tweetId);
            i--;
        }
        return ans;
    }

    public void display() {
        allUserTweets.forEach((user, tweet) -> System.out.println("Users : -> " + user + " : " + "Tweet Id : " + tweet.id + " Tweet Follows : " + tweet.fallows));
    }
}
class Tweet{
    Integer userId ;
    Integer tweetId ;

    public Tweet(Integer userId, Integer tweetId) {
        this.userId = userId;
        this.tweetId = tweetId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTweetId() {
        return tweetId;
    }

    public void setTweetId(int tweetId) {
        this.tweetId = tweetId;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "userId=" + userId +
                ", tweetId=" + tweetId +
                '}';
    }
}
class User{
    int id;
    HashSet<Integer> fallows;
    User(int userId) {
        this.id = userId;
        fallows = new HashSet<>();
    }

}




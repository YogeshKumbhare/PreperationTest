package DSA.StackAndQueue.interviewquestions;

import java.util.List;

public class TwitterMain {

    public static void main(String[] args) {
        Twitter tm = new Twitter();
        tm.postTweet(1, 234);
        tm.postTweet(2, 23738);

        //tm.postTweet(1, 235);;
        tm.display();
        tm.follow(1,2);
        tm.follow(2,3);
        System.out.println("After Tweet Follower 1 followeeid 2 ");

        tm.display();
        System.out.println("After Tweet Unfollow 2 ");
        tm.unfollow(1,2);
//        tm.follow(2,3);
//        tm.unfollow(2,3);

        tm.display();
        List<Integer> tmList = tm.getNewsFeed(2);
        System.out.println("TMList" + tmList);
    }
}

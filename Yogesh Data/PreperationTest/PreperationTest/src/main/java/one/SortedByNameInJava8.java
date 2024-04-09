package one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByNameInJava8 {

    static class User {
        double score;

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public User(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "User{" +
                    "score=" + score +
                    '}';
        }
        // Constructor // Getters // Setters
    }
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User(19d));
        users.add(new User(67d));
        users.add(new User(50d));
        users.add(new User(91d));

        List<User> sortedUsers = users
                .stream().filter(e -> e.getScore() > 50)
                .sorted(Comparator.comparing(User::getScore))
                .collect(Collectors.toList());
        System.out.println(sortedUsers);
    }
}

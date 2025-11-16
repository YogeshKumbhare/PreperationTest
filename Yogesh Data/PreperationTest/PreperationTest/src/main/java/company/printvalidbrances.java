package company;

// Java program to count the number of pairs
// of balanced parentheses
import java.util.HashMap;

class printvalidbrances
{

    // Function to count the number of pairs
    static int countPairs(String[] bracks, int num)
    {

        // Hashing function to count the
        // opening and closing brackets
        HashMap<Integer, Integer> open = new HashMap<>();
        HashMap<Integer, Integer> close = new HashMap<>();

        int cnt = 0;

        // Traverse for all bracket sequences
        for (int i = 0; i < num; i++)
        {

            // Get the string
            String s = bracks[i];
            int l = s.length();

            // Counts the opening and closing required
            int op = 0, cl = 0;

            // Traverse in the string
            for (int j = 0; j < l; j++)
            {

                // If it is a opening bracket
                if (s.charAt(j) == '(')
                    op++;

                    // Closing bracket
                else
                {

                    // If openings are there, then close it
                    if (op != 0)
                        op--;

                        // Else increase count of closing
                    else
                        cl++;
                }
            }

            // If requirements of openings
            // are there and no closing
            if (op != 0 && cl == 0)
                open.put(op, open.get(op) == null ?
                        1 : open.get(op) + 1);

            // If requirements of closing
            // are there and no opening
            if (cl != 0 && op == 0)
                close.put(cl, close.get(cl) == null ?
                        1 : close.get(cl) + 1);

            // Perfect
            if (op == 0 && cl == 0)
                cnt++;
        }

        // Divide by two since two
        // perfect makes one pair
        cnt /= 2;

        // Traverse in the open and find
        // corresponding minimum
        for (HashMap.Entry<Integer,
                Integer> it : open.entrySet())
            cnt += Math.min(it.getValue(),
                    close.get(it.getKey()));

        return cnt;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String[] bracks = { ")())" };
        int num = bracks.length;

        System.out.println(countPairs(bracks, num));
    }
}

// This code is contributed by
// sanjeev2552


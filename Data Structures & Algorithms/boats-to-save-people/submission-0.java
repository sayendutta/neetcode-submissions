class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // let's sort people based on their weights
        Arrays.sort(people);
        // go for two pointers approach, as boat can carry at most 2 people
        // people[i] + people[j] <=linit
        // i++, j--
        // else
        // j--
        // both the cases boats ++

        int boats = 0, n = people.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            int sum = people[i] + people[j];
            if (sum <= limit) {
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
}
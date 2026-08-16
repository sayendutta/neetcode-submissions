class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int x : asteroids) {

            if (x > 0) {
                s.push(x);
            } else {
                boolean destroyed = false;

                while (!s.isEmpty() && s.peek() > 0) {
                    if (s.peek() < -x) {
                        // Top asteroid explodes
                        s.pop();
                    } else if (s.peek() == -x) {
                        // Both explode
                        s.pop();
                        destroyed = true;
                        break;
                    } else {
                        // Current negative asteroid explodes
                        destroyed = true;
                        break;
                    }
                }

                // If it survived all collisions, push it
                if (!destroyed) {
                    s.push(x);
                }
            }
        }

        int[] ans = new int[s.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }
}
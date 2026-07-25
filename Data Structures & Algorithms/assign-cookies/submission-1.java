class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //sort both the arrays in ascending order
        Arrays.sort(g);
        Arrays.sort(s);
        int content = 0;
        int i = 0, j = 0;
        //Go for two pointer approach
        //try to satisfy greed with min possible satisfiable cookie
        while(i<g.length && j<s.length) {
            if(g[i]<=s[j]) {
                content++;
                i++; 
            } 
            j++;
        }
        return content;
    }
}
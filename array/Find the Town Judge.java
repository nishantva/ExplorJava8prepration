Input: n = 3, trust = [[1,3],[2,3]]
Output: 3


class Solution {
    public int findJudge(int n, int[][] trust) {

        int indegree[] = new int[n + 1]; //We create n + 1 because people are numbered from 1 to n
        int outdegree[] = new int[n + 1];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];

            outdegree[a]++;  // a trusts someone
            indegree[b]++;   // b is trusted
        }

        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}

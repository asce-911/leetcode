
import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        int start = intervals.length > 0 ? intervals[0][0] : newInterval[0];
        boolean insert = false;

        for(int i = 0; i < intervals.length; i++) {

            if(!insert && intervals[i][0] >= newInterval[0]) {
                res.add(new int[]{newInterval[0], newInterval[1]});
                insert = true;
            }

            res.add(new int[]{intervals[i][0], intervals[i][1]});
        }

        if(!insert) {
            res.add(new int[]{newInterval[0], newInterval[1]});
        }

        int start1 = res.get(0)[0];
        int end1 = res.get(0)[1];

        List<int[]> ans = new ArrayList<>();

        for(int i = 1; i < res.size(); i++) {

            if(res.get(i)[0] <= end1) {

                end1 = Math.max(end1, res.get(i)[1]);

            } else {

                ans.add(new int[]{start1, end1});

                start1 = res.get(i)[0];
                end1 = res.get(i)[1];
            }
        }

        ans.add(new int[]{start1, end1});

        return ans.toArray(new int[ans.size()][]);
    }
}

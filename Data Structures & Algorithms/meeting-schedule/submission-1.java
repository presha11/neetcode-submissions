/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
            intervals.sort(Comparator.comparingInt(interval -> interval.start));
             int i = 0 , j=1;
             while(j < intervals.size())
             {
                     if(intervals.get(i).end > intervals.get(j).start)
                return false;

                else
                {
                    i++;
                    j++;
                }

             }
         
           return true;

}
}

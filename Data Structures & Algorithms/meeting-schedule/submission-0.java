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

           for(int i = 0 ; i < intervals.size() -1; i++)
           {
            for(int j = i+1 ; j< intervals.size() ; j++)
            {
                if(intervals.get(i).end > intervals.get(j).start)
                return false;
            }
           }

           return true;

}
}

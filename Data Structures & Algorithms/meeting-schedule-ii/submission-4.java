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
    public int minMeetingRooms(List<Interval> intervals) {
               int[] start = new int[intervals.size()];
               int[] end = new int[intervals.size()];

               for(int i = 0 ; i < intervals.size() ; i++)
               {
                start[i] = intervals.get(i).start;
                end[i] = intervals.get(i).end;
               }

               int e = 0; 
               int s = 0;

               Arrays.sort(start);
               Arrays.sort(end);

        int rooms = 0;
        int maxRooms = 0;

        while(s < intervals.size())
        {
            if(start[s] < end[e])
            {
                s++;
                rooms++;
            }
            else
            {
                e++;
                rooms--;
            }

            maxRooms = Math.max(maxRooms , rooms);
        }

        return maxRooms;
    }
}

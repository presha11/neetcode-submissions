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
          Collections.sort(intervals ,Comparator.comparingInt(interval -> interval.start ));
          PriorityQueue<Integer> endTime = new PriorityQueue<>();

          

            
           for(int i = 0 ; i < intervals.size()  ; i++)
           {

           if(!endTime.isEmpty() && endTime.peek()<= intervals.get(i).start)
           {
            endTime.poll();
            
           }
              endTime.offer(intervals.get(i).end);
           } 
           return endTime.size();

    }
}

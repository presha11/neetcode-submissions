class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>(); 
        int fresh = 0;
        int time = 0 ;

        for(int r = 0  ; r < grid.length; r++)
        {
            for(int c = 0 ; c < grid[0].length ; c++)
            {
                if(grid[r][c] == 2)
                {
                    q.offer(new int[]{r,c});
                }

                 if(grid[r][c] == 1)
                {
                    fresh++;
                }
            }
        }

        int[] delRow = {-1 , 0 , +1 , 0  };
        int[] delCol = {0 ,+1 , 0 , -1};
        while(fresh > 0 && !q.isEmpty())
        {  int size = q.size();
            for(int i = 0 ; i < size; i++)
         {  int[] curr = q.poll();
            int row = curr[0];
            int col  = curr[1];

            for(int j = 0 ; j < 4 ; j++)
            {
                int r= row + delRow[j];
                int c= col + delCol[j];

                if(r >=0 && r< grid.length && c>= 0 && c < grid[0].length && grid[r][c] ==1)
                {
                    grid[r][c] = 2;
                    q.offer(new int[]{r, c});
                    fresh--;
                }
            }
        }
        time++;
        }

        return fresh == 0 ? time : -1;


    }


    
}
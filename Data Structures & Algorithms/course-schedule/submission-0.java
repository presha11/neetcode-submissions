class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int[]  indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i++)
        {
            adj.add(new ArrayList<>());
        }
          

        for( int i = 0 ; i < prerequisites.length ; i++)
        {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
       

        for(int i = 0 ; i < numCourses; i ++)
        {
            for(int it : adj.get(i))
            {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i++)
        {
            if(indegree[i] ==0)
            q.add(i);
        }
        int i =0 ;

        List<Integer>  res = new ArrayList<Integer>();
        
            while(!q.isEmpty())
            {
                int node = q.peek();
                q.remove();
                res.add(node);
                for(int it : adj.get(node))
                {
                    indegree[it]--;

                    if(indegree[it] ==0)
                    q.add(it);
                }
            }
        if(res.size() == numCourses) return true;
       
        return false;
    }
}

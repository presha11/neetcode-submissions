class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas =0;
        int totalCosr = 0;

        for(int i =0 ; i < gas.length ; i++)
        {
            totalGas = totalGas +gas[i];
            totalCosr = totalCosr +cost[i];
        }

        if(totalCosr >totalGas)
        return -1;

     totalGas= 0;
int result = 0;
        for(int i = 0; i < gas.length ; i++)
        {
            totalGas = totalGas + gas[i] - cost[i];
            if(totalGas<0)
            {totalGas =0;
            result = i+1;
            }
        }
        return result;
    }
}

// Time Complexity : O(mn) traverse the entire matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class PaintHouse {
    public int minCost(int[][] costs) {
        if(costs == null) return 0;
        
        if(costs.length == 1) return Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));
        
        for(int i = costs.length-2; i>=0; i--){
            for(int j=0;j<costs[0].length;j++){
                costs[i][j] = costs[i][j] + Math.min(costs[i+1][(j+1) % 3], costs[i+1][(j+2) % 3]);
            }
        }
        
        return Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));
        
    }
}
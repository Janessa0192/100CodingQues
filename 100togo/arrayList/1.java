class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> ls = new ArrayList<>();

        int left=0;int top=0;int bottom = matrix.length;
        int right = matrix[0].length;
        
        while(left<right && top<bottom)

        {
            for(int i=left;i<right;i++){
             ls.add(matrix[top][i]);
        }
        top++;

        for(int i=top;i<bottom;i++){
             ls.add(matrix[i][right-1]);
        }
        right--;

       if(top<bottom){
        for(int i=right-1;i>=left;i--){
             ls.add(matrix[bottom-1][i]);
        }
        bottom--;
       }
       
       if(left<right){
        for(int i=bottom-1;i>=top;i--){
             ls.add(matrix[i][left]);
        }
        left++;
        }

        }

        return ls;
    }
}
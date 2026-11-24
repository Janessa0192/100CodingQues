// brute approach

class Solution {
    public int maxArea(int[] height) {
        
        int area=0; int maxArea=0;

        for(int i=0;i<height.length;i++){
            for(int j=0;j<height.length;j++){
                area = (j-i)* (Math.min(height[i],height[j]));
                maxArea = Math.max(area,maxArea);
            }
        }

        return maxArea;
    }
}


// optimal -  2 pointer approach

class Solution {
    public int maxArea(int[] height) {
        
        int area=0; int maxArea=0;

        int i=0; int j=height.length-1;

        while(i<j){
            area = (j-i)*(Math.min(height[i],height[j]));
            maxArea = Math.max(maxArea,area);

            if(height[j]<=height[i]) j--;
            else i++;
        }
        
        return maxArea;
    }
}
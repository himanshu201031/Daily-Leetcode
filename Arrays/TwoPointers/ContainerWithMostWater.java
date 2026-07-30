package TwoPointers;

public class ContainerWithMostWater {
    public  static int maxArea(int[] height) {

    int left = 0;
    int n= height.length;
    int right = n-1;
    int maxarea=0;

    
    while(left<right){
        int h=Math.min(height[left],height[right]);
        int w=right-left;
        int area=w*h;
        maxarea=Math.max(area,maxarea);

        if(height[left]<=height[right]){
            left++;
        }
        else{
            right--;
        }
    }
    return maxarea;

}

public static void main(String[] args) {
    int [] height = {1,8,6,2,5,4,8,3,7};
    int rs=maxArea(height);
    System.out.print(rs);
}
}

public class maxarea {
    public static int maxArea(int[] height) {
        int area = 0;int min=0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if (height[i]<=height[j]) {
                    min = height[i];
                }
                else{
                    min = height[j];
                }
                if (min*(j-i)>area) {
                    area = min*(j-i);
                }
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int height[]= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

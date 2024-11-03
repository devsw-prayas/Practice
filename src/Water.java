public class Water {
    public int maxArea(int[] height) {
        if(height.length > 100000 || height.length < 2) return -1;
        for (int j : height) if (j > 100000 || j < 0) return -1;
        int max  = 0, distance = 0, h = 0;
        for(int left = 0, right = height.length - 1; left < right;){
            h = Math.min(height[left], height[right]);
            distance = right - left;
            if(height[left] < height[right]) left++;
            else right--;
            if(h * distance > max) max = h * distance;
        }
        return max;
    }

    public static void main(String[] args) {
        Water water = new Water();
        System.out.println(water.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}

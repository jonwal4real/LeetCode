class Solution {
    public int largestPerimeter(int[] list) {
        // List<Integer> list = new ArrayList();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
        // Collections.sort(list);
        // int size = list.size();
        Arrays.sort(list);
        for(int i = list.length-1;i>1;i--){
            if(list[i]<list[i-1]+list[i-2]){
                return list[i]+list[i-1]+list[i-2];
            }
        }
        return 0;
    }
}
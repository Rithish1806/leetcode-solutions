class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:nums){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        arr.addAll(map.keySet());
        arr.sort((a,b) -> Integer.compare(map.get(b),map.get(a)));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
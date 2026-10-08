class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ArrayList<Integer> l = new ArrayList<>(set);
        Collections.sort(l);
        for(int i=0;i<set.size();i++){
            nums[i] = l.get(i);
        }
        return set.size();
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        HashSet <Integer> sets=new HashSet<>();
    for(int num:nums){
            if(!sets.contains(num)){
                 sets.add(num);
            }
            else {
                sets.remove(num);
            }
    }
            return sets.iterator().next();
    
    }
}

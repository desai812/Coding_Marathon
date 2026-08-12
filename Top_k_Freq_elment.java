class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.merge(x, 1, Integer::sum);
        } 

        PriorityQueue<Map.Entry<Integer, Integer>> pq
            = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (var e : map.entrySet()) {
            pq.offer(e);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}

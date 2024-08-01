class Solution {
    public int[] frequencySort(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      int [] result = new int[nums.length];
      int index =0;
      for(int num: nums){
        map.put(num,map.getOrDefault(num,0)+1);
      } 
      PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->{
      int fc = map.get(a)-map.get(b);
      return fc==0? b-a : fc;
      });
      minHeap.addAll(map.keySet());
      while(!minHeap.isEmpty()){
        int currentchar = minHeap.poll();
        int count = map.get(currentchar);
        for(int i=0; i<count;i++){
            result[index++] = currentchar;
        }
      }

      return result;
    }
}
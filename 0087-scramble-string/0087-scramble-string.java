// class Solution {
//     public boolean isScramble(String s1, String s2) {
//         if(s1.length()!=s2.length()){
//             return false;
//         }
//         if(s1.isEmpty()||s2.isEmpty()){
//             return true;
//         }
//         if(s1.compareTo(s2)==0){
//             return true;
//         }
//         if(s1.length()<=1){
//             return false;
//         }
//         boolean flag = false;
//         int n = s1.length();

//         for(int i=1; i<=n-1; i++){
//             boolean cond1 = isScramble(s1.substring(0,i),s2.substring(n-i))==true
//                && isScramble(s1.substring(i),s2.substring(0,n-i))==true;

//             boolean cond2 = isScramble(s1.substring(0,i),s2.substring(0,i))==true
//                && isScramble(s1.substring(i),s2.substring(i))==true; 

//                if(cond1||cond2){
//                 flag = true;
//                 break;
//                }
//         }

//       return flag;
//     }
// }
class Solution {
    Map<String, Boolean> mp = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();

      
        if (s2.length() != n)
            return false;

      
        if (s1.equals(s2))
            return true;

        if (n == 1)
            return false;

        String key = s1 + " " + s2;

        
        if (mp.containsKey(key))
            return mp.get(key);

        
        for (int i = 1; i < n; i++) {
         
            boolean withoutswap = (
                    
                    isScramble(s1.substring(0, i), s2.substring(0, i))

                            &&

                           
                            isScramble(s1.substring(i), s2.substring(i))
            );

            
            if (withoutswap) {
                mp.put(key, true);
                return true;
            }

            
            boolean withswap = (
                    
                    isScramble(s1.substring(0, i), s2.substring(n - i))

                            &&

                           
                            isScramble(s1.substring(i), s2.substring(0, n - i))
            );

           
            if (withswap) {
                mp.put(key, true);
                return true;
            }
           
        }
        mp.put(key, false);
        return false;
    }
}
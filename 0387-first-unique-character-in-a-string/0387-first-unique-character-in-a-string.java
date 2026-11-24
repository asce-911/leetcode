class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i = 0;
        while(i<s.length()){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            i++;
        }
        for(i = 0; i<s.length();i++){
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
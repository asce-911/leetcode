class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i = 0;
        for( i = 0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        i = 0;
        int max = 0;
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue()%2==0){
                i = i + entry.getValue();
            } else if(entry.getValue()%2!=0){
                i = i + entry.getValue() -1;
                max = 1;
            }
        }
        return (i+max);
    }
}
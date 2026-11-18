class Solution {
    public int numberOfSubstrings(String s) {
        int c = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        hm.put('a',-1);
        hm.put('b',-1);
        hm.put('c',-1);
        for(int i = 0; i<s.length();i++){
            hm.put(s.charAt(i),i);
            if(hm.get('a')!=-1 && hm.get('b')!=-1 && hm.get('c')!=-1){
                c = c + (Math.min(hm.get('a'), Math.min(hm.get('b'), hm.get('c')))+1);
            }
        }
        return c;
    }
}
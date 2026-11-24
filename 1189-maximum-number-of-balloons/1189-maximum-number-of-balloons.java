class Solution {
    public int maxNumberOfBalloons(String text) {
       HashMap<Character,Integer> hm = new HashMap<>();
       HashMap<Character,Integer> r = new HashMap<>();
       hm.put('b',1);
       hm.put('a',1);
       hm.put('n',1);
       hm.put('l',2);
       hm.put('o',2);
       int i = 0;
       while(i<text.length()){
        r.put(text.charAt(i),r.getOrDefault(text.charAt(i),0)+1);
        i++;
       }
       i = 0;
       if(r.get('b')!=null && r.get('a')!=null && r.get('l')!=null && r.get('o')!=null && r.get('n')!=null){
       while(hm.get('b')<=r.get('b') && hm.get('a')<=r.get('a') && hm.get('l')<=r.get('l') && hm.get('o')<=r.get('o') && hm.get('n')<=r.get('n')){
        i++;
        hm.put('b',hm.get('b')+1);
        hm.put('a',hm.get('a')+1);
        hm.put('l',hm.get('l')+2);
        hm.put('o',hm.get('o')+2);
        hm.put('n',hm.get('n')+1);
       }
       }
       return i;
    }
}
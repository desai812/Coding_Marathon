class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] newarray=new int[26];

        for(int i=0;i< s.length();i++){
            newarray[s.charAt(i) - 'a']++;
            newarray[t.charAt(i) - 'a']--;

        }
        for(int count:newarray){
            if(count!=0)
                return false;
            }
    
            return true;
        }
}
    
        
    

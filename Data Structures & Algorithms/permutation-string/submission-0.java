class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()){
        return false;
       }
       int[] s1count=new int[26];
       int[] windowcount=new int[26];
       for(int i=0;i<s1.length();i++){
        s1count[s1.charAt(i)-'a']++;
        windowcount[s2.charAt(i)-'a']++;
       }
       if(Arrays.equals(s1count,windowcount)){
        return true;
       }
       for(int r=s1.length();r<s2.length();r++){
        windowcount[s2.charAt(r)-'a']++;
        windowcount[s2.charAt(r-s1.length())-'a']--;
        if(Arrays.equals(s1count,windowcount)){
            return true;
        }
       }
       return false;
        
        
    }
}

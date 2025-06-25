class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character, Integer> need = new HashMap<>();
        HashMap <Character, Integer> currentWindow = new HashMap<>();
        if(s.length() < t.length()) return "";
        for(int i=0; i <t.length(); i++){
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        int l = 0, r = 0;
        int have =0; 
        int needCount = need.size();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(r);
            currentWindow.put(c, currentWindow.getOrDefault(c,0) + 1);
            if(need.containsKey(c) && need.get(c).intValue() == currentWindow.get(c).intValue()){
                have++;
            }
            while(have == needCount){
                if((r - l + 1) < minLen){
                    minLen = r - l + 1;
                    minStart = l;
                }
                char leftChar = s.charAt(l);
                currentWindow.put(leftChar, currentWindow.get(leftChar) - 1);

                if(need.containsKey(leftChar) && need.get(leftChar) > currentWindow.get(leftChar)){
                    have--;
                }
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {

    HashMap<Character, Integer> hashS = new HashMap<Character, Integer>();
    HashMap<Character, Integer> hashT = new HashMap<Character, Integer>();

    if (s.length() != t.length()){
        return false;
    }
    for (int i = 0; i < s.length(); i++){
        hashS.put(s.charAt(i), hashS.getOrDefault(s.charAt(i), 0) + 1);
        hashT.put(t.charAt(i), hashT.getOrDefault(t.charAt(i), 0) + 1);
    }
    boolean ifEqual = hashS.equals(hashT);

    if (ifEqual == true){
        return true;
    } else{
        return false;
    }
  } 
}

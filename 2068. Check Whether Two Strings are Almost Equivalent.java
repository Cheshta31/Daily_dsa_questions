https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/

class Solution {
    public boolean checkAlmostEquivalent(String w1, String w2) {
            HashMap<Character,Integer> map1=new HashMap<>();
             HashMap<Character,Integer> map2=new HashMap<>();

        int l1=w1.length();int l2=w2.length();
        for(int i=0;i<l1;i++){
            if(map1.containsKey(w1.charAt(i))){
                map1.put(w1.charAt(i),map1.get(w1.charAt(i))+1);
            }
            else{
                map1.put(w1.charAt(i),1);
            }
        }
   for(int i=0;i<l2;i++){
            if(map2.containsKey(w2.charAt(i))){
                map2.put(w2.charAt(i),map2.get(w2.charAt(i))+1);
            }
            else{
                map2.put(w2.charAt(i),1);
            }
        }
String allchar="";
for(int i=0;i<l1;i++){
    if(allchar.indexOf(w1.charAt(i))==-1){
allchar+=w1.charAt(i);
    }
}
for(int i=0;i<l2;i++){
    if(allchar.indexOf(w2.charAt(i))==-1){
allchar+=w2.charAt(i);
    }
}
System.out.println(allchar);
for(int i=0;i<allchar.length();i++){
    
    char ch=allchar.charAt(i);
   if(w2.indexOf(ch)==-1){
      map2.put(ch,0);
   } 
   else if(w1.indexOf(ch)==-1){
      map1.put(ch,0);
   }   

    // System.out.println("word 1 "+map1.get(ch));
    //   System.out.println("word 2 "+map2.get(ch));
    if((Math.abs(map1.get(ch)-map2.get(ch))>3)){
        return false;
    }
}

return true;
    }
}

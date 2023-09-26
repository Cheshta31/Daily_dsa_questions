class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s3=s1+s2;
        String arr=new String[s3.length];
            int j=0,k=0;
        for(int i=0;i<s3.length();i++){
            if(s.charAt(i)==" ")
            {
                arr[k]=s.substring(j,i);
                j=i+1;k++;
            }
        }
HashMap<String,Integer> hs=new HashMap<>();

for(int i=0;i<s3.length();i++){
    if(hs.containsKey(arr[i])){
        hs.get(arr[i])+1;
    }
    else{
        hs.put(arr[i],1);
    }
}
ArrayList<String> al=new ArrayList<>();

  for (Map.Entry<String,String> entry : hs.entrySet())
{
if(entry.getValue()==1){
    ans.add(entry.getKey());
   
}


}
return al;

    }
}

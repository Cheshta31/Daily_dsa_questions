class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack <Integer> st=new Stack<Integer>();
      List<String> al=new ArrayList<String>();
      int currnum=1,index=0;

      while(currnum<=n && index<target.length){
                int num=target[index];
            if(num==currnum){
                al.add("Push");
                currnum++;
                index++;
            }
            else{
                al.add("Push");
                al.add("Pop");
                currnum++;
            }
      }

      return al;
    }
}

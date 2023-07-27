class Solution {
    public int dayOfYear(String date) {
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};int daycount=0;
   String m="";
   m=date.substring(5,7);
   int monthh=Integer.parseInt(m); 
   String y="";
   y=date.substring(0,4);
   int year=Integer.parseInt(y); 
   String d="";
    d=date.substring(8,10);

int day=Integer.parseInt(d); 
   
        if (year % 400 == 0|| (year % 100 != 0 && year % 4 == 0)){
      month[1]=29;
  }
        for(int i=0;i<monthh-1;i++){
daycount+=month[i];
        }
    
        return daycount+=day;
    }
}

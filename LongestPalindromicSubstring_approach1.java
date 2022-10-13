class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        int strLen = s.length();
        String result="";
        int minIndex = 0;
        int maxIndex = 0;
        int size = 1;
        for(int i=1;i<strLen;i++){
            int k=1;
            int tempSize = 0;
            if(s.charAt(i)==s.charAt(i-1)){
                tempSize += 2;
                if((i-k >= 0) && (i+k < strLen)){
                    try{
                        while(s.charAt(i-1-k)==s.charAt(i+k)){
                            tempSize += 2;
                            k++;
                        }
                    }catch(IndexOutOfBoundsException e){
                        //System.out.println("0");
                    }
                }
                if(tempSize>size){
                    size = tempSize;
                    minIndex = i-k;
                    maxIndex = i+k-1;
                }
            }
                k=1;
                if((i-k >= 0) && (i+k < strLen)){
                    tempSize = 1;
                    try{
                        while(s.charAt(i-k)==s.charAt(i+k)){
                            tempSize += 2;
                            k++;
                        }
                    }catch(IndexOutOfBoundsException e){
                        //System.out.println("1");
                    }
                    if(tempSize>size){
                        size = tempSize;
                        minIndex = i-k+1;
                        maxIndex = i+k-1;
                    }
                }
                
        }
        for(int i = minIndex;i<=maxIndex;i++){
            result += s.charAt(i);
        }
        return result;
    }
}
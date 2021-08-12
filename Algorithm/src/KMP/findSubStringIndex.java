package KMP;

public class findSubStringIndex {
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        int[]next=getNext(needle);
        int i=0,j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==needle.length()){
                return i-j;
            }else{
                if(i<haystack.length()&&haystack.charAt(i)!=needle.charAt(j)){
                    if(j==0){
                        i++;
                    }else{
                        j=next[j-1];
                    }
                }
            }

        }
        return -1;
    }

    /*
    * find the longest length of substring prefix and suffix.
    * like "abcabc" its substring abcab
    *
    * */
    private static int[] getNext(String needle){
        if(needle.length()==0){
            return null;
        }
        int[]next=new int[needle.length()];
        next[0]=0;
        int j=1,k=0;
        while(j<needle.length()){
            while(k!=0&&needle.charAt(j)!=needle.charAt(k)){
                k=next[k-1];
            }
            if(needle.charAt(k)==needle.charAt(j)){

                next[j]=k+1;
                k++;
            }
            j++;
        }
        return next;
    }
}

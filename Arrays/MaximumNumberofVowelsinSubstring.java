public class MaximumNumberofVowelsinSubstring {
    public static int maxvl(String s,int k){
     int count=0,max=0;
     char[] str = s.toCharArray();
     for(int i=0;i<k;i++){
        if(isVowel(str[i])){
            count++;

        }
        max=count;
     }
     for(int i=k;i<str.length;i++){
        if(isVowel(str[i-k]))
            count--;
        if(isVowel(str[i]))
            count++;

    max=Math.max(count,max);

     }
return max;
    }
    public  static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="abbcdfiiieak";
        int k=3;

        int rt= maxvl(s,k);
        System.out.println(rt);

    }
}


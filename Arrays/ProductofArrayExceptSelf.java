public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        
        int []num={1,2,3,5,3};
        int n= num.length;
        int ans[]=new int[n];
ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*num[i-1];

        }
    int suf=1;
    for(int j= n-1;j>=0;j--){
        ans[j]=ans[j]*suf;
        suf=suf*num[j];
    }
;
return;
    }
}


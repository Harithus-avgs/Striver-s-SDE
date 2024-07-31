class Solution {
    public double myPow(double x, int n) {
        if(n==-2147483648 && x>1){
            return (double)0;
        }
       double ans = 1.0;
       long m=n;
       if(n<0){
        m=-1*n;
        x=1/x;
       } 
       while(m>0){
        if(m%2==0){
            x=x*x;
            m=m/2;
        }
        else{
            ans=ans*x;
            m=m-1;
        }
       }
       return ans;
    }
}
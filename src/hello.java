public class hello {
    public static void  main (String[] args) {
        System.out.println(fib(6));
    }
    public static int fib(int n){
        int [] dp = new int[n+1];
        for(int i =0 ; i<n+1; i++){
            dp[i]  = -1;
        }
        return helper(n,dp);
    }
    public static int helper(int n, int[] dp){
        if(dp[n] != -1){
            return dp[n];
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        dp[n] = helper(n-1,dp) + helper(n-2,dp);
        return dp[n];
    }






}













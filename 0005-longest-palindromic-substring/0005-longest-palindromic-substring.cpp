class Solution {
public:
    string longestPalindrome(string s) {
        int n=s.length();
        bool dp[1000][1000]={false};
        int start=0,maxlen=1;
        for(int i=0;i<n;i++)
        {
            dp[i][i]=true;
        }
        for(int i=0;i<n;i++)
        {
            if(s[i]==s[i+1])
            {
                dp[i][i+1]=true;
                start=i;
                maxlen=2;
            }
        }
        for(int len=3;len<=n;len++)
        {
            for(int i=0;i<=n-len;i++)
            {
                int j=i+len-1;
                if(s[i]==s[j] && dp[i+1][j-1])
                {
                    dp[i][j]=true;
                    if(len>maxlen)
                    {
                        maxlen=len;
                        start=i;
                    }
                }
            }
        }
        return s.substr(start,maxlen);
    }
};
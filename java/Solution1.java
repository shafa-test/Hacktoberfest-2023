class Solution1 {
    public int myAtoi(String s) {
        s=s.trim();
        String s1="";
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        int m=0;
        for(int i=0;i<s.length();i++)
            if(Character.isDigit(s.charAt(i))  )
            {
                if(i!=0 && s.charAt(i-1)=='-')
                    s1+=s.charAt(i-1);
                break;
            }
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                    s1+=s.charAt(i);
            else if(s.charAt(i)>45)
                break;
        }
        if(Character.isDigit(s.charAt(0))==false && Character.isDigit(s.charAt(1))==false && s.length()>1)
            s1="0";
        if(s1== "" || s1=="-")
            s1="0";
        Double n=Double.valueOf(s1);
        if (n < INT_MIN)
            return INT_MIN;
        if (n > INT_MAX)
            return INT_MAX;
        return n.intValue();
    }
}
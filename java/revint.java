class revint {
    public int reverse(int x) {
        int revint=0,n,prn=0;
        if(-2147483648 > x || x > 2147483647)
            return 0;           //123
        while(x!=0)
        {
            n=x%10;
            revint=revint*10+n;
            if ((revint - n)/10 != prn)
            {
                return 0;
            }
            prn = revint;
            x=x/10;
        }
        return revint;
    }
}
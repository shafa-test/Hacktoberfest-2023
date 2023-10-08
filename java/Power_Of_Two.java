class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n==0)
            return false;
        double d=Double.valueOf(n);
        while(d%2==0)
        {
            d=d/2;
            if(d==1)
                return true;
        }
        return false;
    }
}
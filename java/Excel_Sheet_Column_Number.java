class  Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int l=columnTitle.length();
        double sum=0;
        if(l==1)
            return (int)columnTitle.charAt(0)-64;
        for(int i=0;i<l-1;i++)
        {
            sum+=Math.pow(26,l-(i+1))*(columnTitle.charAt(i)-64);
        }
        sum+=(columnTitle.charAt(l-1)-64);
        if(sum<0)
            return 2147483647;
        return (int)sum;
    }
}
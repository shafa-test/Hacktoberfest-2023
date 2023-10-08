class Add_Digits {
    public int addDigits(int num) {
        int r,s=0;
        while(true)
        {
            r=num%10;
            s+=r;
            num/=10;
            if(num==0)
            {
                if(s<10)
                    return s;
                num=s;
                s=0;
            }
        }
    }
}
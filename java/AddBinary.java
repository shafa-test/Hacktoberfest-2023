class AddBinary{
    public String addBinary(String a, String b) {
        String s1="",s2="",s3="";
        int l=a.length()<b.length() ? a.length() :b.length();
        for(int i=a.length()-1;i>=0;i--)
            s1+=a.charAt(i);
        for(int i=b.length()-1;i>=0;i--)
            s2+=b.charAt(i);
        for(int i=0;i<l;i++)
        {
            if(i>0 && s1.charAt(i)=='1' && s2.charAt(i)=='1' && s3.charAt(i-1)=='0')
                s3+=1;
            else if(s1.charAt(i)=='1' && s2.charAt(i)=='1')
                s3+=0;
            else
                s3+=0;
        }
        return a;
    }
}
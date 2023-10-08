class Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        int r=0,a=0;
        String s="",rs="";
        while(columnNumber >0)
        {
            r=columnNumber%26;
            a=64+r;
            if(r==0)
            {
                columnNumber-=26;
                a=64+26;
            } 
            s+=(char)a;
            columnNumber=columnNumber/26;
        }
        for(int i=s.length()-1;i>=0;i--)
            rs+=s.charAt(i);
        return rs;
    }
}
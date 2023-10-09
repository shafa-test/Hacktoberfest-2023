class IndexOfFirstOccurrence
{
    public int strStr(String haystack, String needle)
    {
        int l1=haystack.length();
        int l2=needle.length();
        if(l1<l2)
            return -1;
        if(haystack.equals(needle))
            return 0;
        for(int i=0;i<l1+1-l2;i++)
        {
            if(haystack.substring(i,i+l2).equals(needle))
                return i;
        }
        return -1;
    }
}
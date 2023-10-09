class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder sn=new StringBuilder(s);  
        sn.reverse();
        if(sn.toString().equals(s))
            return true;
        return false;
    }
}

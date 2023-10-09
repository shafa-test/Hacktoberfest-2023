class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] aOfS = s.split(" ");
        int l=aOfS.length;
        l=aOfS[l-1].length();
        return l;
    }
}
import java.util.*;
class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t)
    {
        Map<Character, Integer> String_s = new HashMap<>();
        Map<Character, Integer> String_t = new HashMap<>();
        for (Integer i = 0; i < s.length(); ++i)
            if (String_s.put(s.charAt(i), i) != String_t.put(t.charAt(i), i))
                return false;
        return true;
    }
}
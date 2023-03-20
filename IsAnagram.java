public class IsAnagram {
    
    public static void main(String[] args) {
        String s = "anagram", t = "nagara";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s1, String s2) 
    {
        if (s1.length() != s2.length()) return false;

        int[] alphabets = new int[26];

        for(int i = 0; i < s1.length(); i++)
        {
            alphabets[s1.charAt(i) -'a']++ ;
            alphabets[s2.charAt(i) - 'a']--;
        }

        for(int x : alphabets) if (x != 0) return false;

        return true;
        // HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        // HashMap<Character, Integer> t = new HashMap<Character, Integer>();
        

        // for(int i = 0; i <s1.length(); i++)
        //     {
        //         if (s1.length() != s2.length())
        //             return false;
        //         //s1
        //         if(!s.containsKey(s1.charAt(i)))
        //         {
        //             s.put(s1.charAt(i), 1);
        //         }else{
        //             s.put(s1.charAt(i), s.get(s1.charAt(i)) + 1);
        //         }
        //         // s2 
        //         if(!t.containsKey(s2.charAt(i)))
        //         {
        //             s.put(s2.charAt(i), 1);
        //         }else{
        //             s.put(s2.charAt(i), s.get(s1.charAt(i)) + 1);
        //         }
        //     }
        // for(int i = 0; i < s.size(); i++)
        // {
        //     if(s.get(s1.charAt(i)) != t.get(s1.charAt(i)))
        //         return false;
        // }
        // System.out.println(s);
        // System.out.println(t);

        // s.forEach(null);

   
    }
}

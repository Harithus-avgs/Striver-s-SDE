class Solution {
    public String reverseWords(String s) {
        s = s.trim(); 
        Stack<String> st = new Stack<>();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (l != i) {
                    String sub = s.substring(l, i);
                    st.push(sub);
                }
                l = i + 1;
            }
        }
        if (l < s.length()) {
            String sub1 = s.substring(l, s.length());
            st.push(sub1);
        }
        StringBuilder rev = new StringBuilder();
        while (!st.isEmpty()) {
            rev.append(st.pop());
            if (!st.isEmpty()) {
                rev.append(" ");
            }
        }
        
        return rev.toString();
    }
}

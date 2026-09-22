class Solution {
    public void reverseString(char[] s) {
        int i =0, j =s.length -1;

        

        while( i<j ) {
            // swap the characters at position i and j 
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }

        
    }
}
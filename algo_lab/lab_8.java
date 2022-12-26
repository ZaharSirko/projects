public class lab_8 {
    public static void main(String[] args) {
        IsPangram ("The543 quick br8o2wn fooox8 -=jumps ovE9r the la2zY do1g");
        IsPangram ("The quick brown fox jumps over the lazy dog");
        IsPangram ("The quick brown jumps over the lazy dog");
        IsPangram ("The quick brown jumps over the lazy do");
    }
        public static void IsPangram (String string)  
        {  
        string = string.toLowerCase();  // підносимо літери до малих
        boolean allLetterPresent = true;  
        for (char ch = 'a'; ch <= 'z'; ch++)   
        {  
        if (!string.contains(String.valueOf(ch)))   // якщо у stirng немає всіх буквенних значень
        {  
        allLetterPresent = false;  
        break;  
        }  
        }  
        System.out.println(allLetterPresent);
        }  
    }

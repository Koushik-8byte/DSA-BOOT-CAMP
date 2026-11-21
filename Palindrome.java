class Palindrome{
        public static void main(String[] a)
        {       
                boolean b=IsPalindrome(121);
                System.out.println(b);
        }       
        public static boolean IsPalindrome(int x)
        {       
                int original=x;
                int reverse=0;
                while(x>0)
                {       
                        int rem= x%10;
                        x/=10;
                        reverse=reverse*10+rem;
                }       
                return original==reverse;
        }
}   

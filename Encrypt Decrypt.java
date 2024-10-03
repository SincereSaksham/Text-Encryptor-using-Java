import java.util.Random;

public class EncryptDecrypt 
{
    public static String Encrypt(String s,int key )
    {
        String str=""; 
        int asci ; 
        char ch ; 
        
        char keymain = (char)key; 
        
        //randomiser
        int max = 1000 ; 
        int min = 1 ; 
        Random random = new Random();
        int rand = min + random.nextInt(max); 
        
        //SUBSTITUTER 
        int finalKey = rand + key ;
        char keyrand = (char)(finalKey);
        
        long n = s.length(); 
        
        for (int i = 0 ; i < n ; i++ ) 
        {
            ch = s.charAt(i); 
            asci = (int)ch ;
            char ch1 = (char)(asci + finalKey); 
            str = str + ch1 ; 
        }
        
        str = str.trim(); 
        str = keymain + str; 
        str = keyrand + str; 
        
        return str; 
    }
    
    
    public static String Decrypt(String str, int key)
    {
        
        String str1 = "" ; 
        char ch0 ,ch1 ; 
        int n ; 
        n = str.length(); 
        ch0 = str.charAt(0); 
        
        int k, dec; 
        dec= (int)ch0; 
        
        for (int i = 2 ; i<n ; i++)
        {
            char ch2 = str.charAt(i); 
            int m = (int)ch2; 
            char ch3 = (char)(m-dec); 
            str1 = str1+ch3; 
        }
        
        str1 = str1.trim(); 
        
        return str1; 
    }
    
    public static boolean keycheck (String str,int k )
    {
        str = str.trim(); 
        
        char ch1 ;  
        ch1 = str.charAt(1); 
        int key = (int)ch1;
        
        if (key == k ) 
        return true; 
        else 
        return false ; 
    }
    
}
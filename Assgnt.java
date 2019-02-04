import java.util.*; 

public class Assgnt 
{ 

    static void printDiamond(int n,int m) 
    { 
        int space = n - 1; 
        int k = m-n;
        int l = 1;
        int v = 1;
        for (int i = 0; i < n; i++) 
        { 

            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
    
 
            for (int j = 0; j <= i; j++) 
                if(k>=0){
                    if(j>=l && j<=v)
                      System.out.print("  ");
                    else
                       System.out.print("1 "); 
                
                    
                }
                else
                System.out.print("1 "); 
    
            System.out.print("\n");
            if(k>=0)
            v++;
            space--;
            k++;
        } 
    

        space = 1; 
        l=1;
        k=n-m;
        v=k;

        for (int i = n - 1; i > 0; i--) 
        { 

            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
    

            for (int j = 0; j < i; j++) 
                if(k>=0){
                    if(j>=l && j<=v)
                      System.out.print("  ");
                    else
                       System.out.print("1 "); 
                
                    
                }
                else
                System.out.print("1 "); 
    
            System.out.print("\n"); 
            space++;
            if(k>=0)
            v--;
        } 
    } 
    

    public static void main(String[] args) 
    { 
        printDiamond(5,3); 
        
    } 
} 



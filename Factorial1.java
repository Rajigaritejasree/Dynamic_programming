class Fact
{
    int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    
}
public class Factorial1ṇ
{
    public static void main(String[] args)
    {
        Fact ob=new Fact();
        int ans=ob.fact(5);
        System.out.println("Factorial of 5 is:"+ans);

    }
}
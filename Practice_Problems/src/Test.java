abstract class X
{
    int i = 11;
 
    int methodOneOfX()
    {
        return i *= i /= i;
    }
 
    abstract void methodTwoOfX(int i);
}
 
class Y extends X
{
    @Override
    void methodTwoOfX(int i)
    {
        System.out.println(i);
    }
}
 
public class Test
{
    public static void main(String[] args)
    {
        new Y().methodTwoOfX(new Y().methodOneOfX());
    }
}

public class Test {
    
    private static int N = 10;
    public static void main(String[] args) 
    { 
        System.out.println("Hello, World");
        QuickUnionUF quf = new QuickUnionUF(N);
        quf.union(1,2);
        printarray(quf, N);
    }
    
    private static void printarray(QuickUnionUF quf, int n)
    {
        for(int i = 0; i < n; i++)
            System.out.println(i + " " + quf.root(i));
    }
}
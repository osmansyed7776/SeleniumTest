package testngdemo.testngdemo;

import org.junit.Test;

public class JunitDemo1
{
    public static void main(String[] args)
    {
        System.out.println("Main method of JunitDemo1");
    }

    @Test
    public void funA()
    {
        System.out.println("funA of JunitDemo1");
    }
    @Test
    public void funB()
    {
        System.out.println("funB of JunitDemo1");
    }
}

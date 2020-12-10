package cp510;

public class InnerClassSandbox
{
    private int     iVar1;
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }
    
    private void oMethod1( int param1 )
    {
//        param1 = 0;
        class oInner1
        {
            private int instVar1 = param1;
        }
    }

    private class Inny
    {
        static final int i = 0;
        public void method2()
        {
            
        }
        public void method1( int param1 )
        {
            iVar1 = 0;
            param1 = 0;
        }
    }
}

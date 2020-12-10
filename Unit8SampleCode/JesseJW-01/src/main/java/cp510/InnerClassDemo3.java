package cp510;

public class InnerClassDemo3
{
   public static void main(String[] args)
   {
      OutClass          outVar  = new OutClass();
      OutClass.InClass  inVar   = outVar.new InClass();
      inVar.speak();
    }
}
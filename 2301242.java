class CheckStaticBlock
{
static
{
System.out.println("m from static block");
}

{
System.out.println("m from init block");
}
CheckStaticBlock()
{
System.out.println("m from class default constructor" );
}
public static void main(String st[])
{
CheckStaticBlock c=new CheckStaticBlock();
}

}
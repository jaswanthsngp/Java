//convert the string to Capital Case
class Main{
    public static void main(String[] args) {
        String s= "lovely ProfessioNal  university";
        char c[]= s.toCharArray();
        if(c[0]>='a' && c[0]<='z')
            c[0]-=32;
        for(int i=1; i<c.length; i++)
        {
            if(c[i]>='a' && c[i]<='z' && c[i-1]==' ')
                c[i]-=32;
            else if(c[i]>='A' && c[i]<='Z' && c[i-1]!=' ')
                c[i]+=32;
        }
        s= new String(c);
        System.out.println(s);
    }
}
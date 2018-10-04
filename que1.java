import java.util.*;
class que1{
  public void fun(Set<Integer>s3){
    Scanner s=new Scanner(System.in);
    System.out.println("enter elements of set and -1 to exit");
   int a=s.nextInt();
    while(a!=-1)
    { 
      s3.add(a);
      a=s.nextInt();
    }
  }
  public static void main(String []args)
  {
    int a;
    que1 m=new que1();
    
    Set<Integer> s1=new HashSet<Integer>();
    Set<Integer> s2=new HashSet<Integer>();
    m.fun(s1);
    m.fun(s2);
    s1.retainAll(s2);
    Iterator it=s1.iterator();
    System.out.println("elements after retain:");
    while(it.hasNext())
    {
     System.out.println(it.next()); 
    }

  }
}
//import java.util.Collection;
import java.util.*;
import java.util.stream.Stream;

class Calculator
{   
    int a, b;
    static int x;
    final int z=2;
    
    static
    {
        System.out.println("in static block");
    }
    
    Calculator()
    {   
        a=5;
        b=10;
        System.out.println("in constructor");
    }

    Calculator(int a, int b)
    {
        this.a= a;
        this.b=b;
        System.out.println(a+" ,"+b);
    }

    static void display()
    {
        x=10;
        System.out.println("static method:"+x);
    }
    
    public int add(int a, int b)
    {
        int r= a+b;
        return r;
    }
}

class A extends Thread
{
    public void run()
    {   
        for(int i =1;i<=10;i++)
        {
            System.out.println("Hi");
        }
        
    }
}

class B extends Thread
{
    public void run()
    {   
        for(int i =1;i<=100;i++)
        {
            System.out.println("Hello");
        }
        
    }
}

class X implements Runnable
{
    public void run()
    {   
        for(int i =1;i<=100;i++)
        {
            System.out.println("Hi");
        }
        
    }
}

class Y implements Runnable
{
    public void run()
    {   
        for(int i =1;i<=10;i++)
        {
            System.out.println("Hello");
        }
        
    }
}

interface C{

    int show(int i, int j);
}

class demo {
    public static void main(String []args) {
        int num1= 10;
        int num2= 20;
        int num3= 40;
        if(num1>num2 && num1>num3)
            System.out.println(num1);
        else if(num2>num1 && num2>num3)
            System.out.println(num2);
        else 
            System.out.println(num3);

        int d=4;

        switch(d)
        {
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default: System.out.println("Not valid");
        }
        for(int i=1; i<=5; i++)
        {
            System.out.println(i);
        }

        int j=6;
        while(j<=10)
        {
            System.out.println(j);
            j++;
        }

        do{
            System.out.println(j);
        }while(j<10);


        
        Calculator calc= new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);

        Calculator obj=new Calculator(20,40);

        Calculator.display();

        //exception handling

        String str=null; 
        
        int m=0;

        class MyException extends Exception
        {
            MyException(String str)
            {
                super(str);
            }
        }

        try 
        {
            //str.length();
            m=18/20;
            if(m==0)
            {
                throw new MyException("Do not print zero");
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("The End!!");
        }

        //Collections
        //List- ArrayList

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(29);
        nums.add(47);
        nums.add(64);
        nums.add(85);
        
        System.out.println(nums);

        for(Object n:nums)
        {
            System.out.println(n);
        }

        //Set

        Set<Integer> vals = new HashSet<Integer>();
        vals.add(22);
        vals.add(43);
        vals.add(67);
        vals.add(84);
        
        Iterator<Integer> values= vals.iterator();
        
        while(values.hasNext())
        {
            System.out.println(values.next());
        }

        //Map

        Map<String,Integer> students= new HashMap<String, Integer>();
        students.put("Sam", 45);
        students.put("Tessa", 65);
        students.put("Meenakshi", 84);
        students.put("Amal", 76);
        students.put("Syed", 67);

        System.out.println(students);

        System.out.println(students.keySet());

        for(String key: students.keySet())
        {
            System.out.println(key+ ":"+ students.get(key));
        }


        //comparator

        Comparator<Integer> com= new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else 
                    return -1;
            }
        };

            Collections.sort(nums,com);
            System.out.println(nums);
        
        //Strings

        str= "Welcome";
        str.concat("here");
        System.out.println(str);
        str=str.concat("hello");
        System.out.println(str);
        


        //String comparisons
        String str1= "hello";
        String str2="hello";
        System.out.println(str1.equals(str2));

        String str3= new String("hello");
        System.out.println(str1 ==str2);
        System.out.println(str1==str3);


        //String Buffer
        StringBuffer sb= new StringBuffer("Hello ");
        sb.append("World");

        
        System.out.println(sb);


        //Multithreading

        /*  A obj1= new A();
        B obj2= new B();

        obj1.start();
        obj2.start();

        //Runnable class

        Runnable obj3= new X();
        Runnable obj4 = new Y();

        Thread t1= new Thread(obj3);
        Thread t2=new Thread(obj4);

        t1.start();
        t2.start();*/

        //Functional Interface

        /*C inter = new C(){

            public void show()
            {
                System.out.println("in show");
            }
        };

        inter.show();*/

        //Lambda expressions
        /*C inter = ()->System.out.println("in show");

        inter.show();*/

        //Lambda expression with return
        C inter = (i,k) -> i+k;

        int res=inter.show(5,7);
        System.out.println(res);

        //Stream API

        List<Integer> arr = Arrays.asList(3,5,2,6,8,0,1);

        Stream<Integer> s1=arr.stream();
        Stream<Integer> s2= s1.filter(n->n%2==0);
        //s2.forEach(n->System.out.println(n));
        Stream<Integer> s3= s2.map(n->n*2);
        s3.forEach(n->System.out.println(n));
        



    }
}






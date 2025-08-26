import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
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
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        
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


    }
}






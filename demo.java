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
        
    }
}

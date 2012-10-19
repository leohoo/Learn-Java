package factoryMethod;

abstract class Person {   
    protected final String name;
    public Person(String name) { 
        this.name = name;
    }
}

class Male extends Person {
    public Male(String name) { 
        super(name);
    }
}

class Female extends Person {
    public Female(String name) { 
        super(name);
    }
}

class PersonFactory
{
     public static Person makePerson(String gender, String name) {
         if(gender.equals("male"))                       
         { 
             Male man=new Male(name);
             return man;
          }
          else
         {
             Female woman=new Female(name);
             return woman;
         }
     }
}

public class FactoryMethodPattern 
{
    public static void main(String[] args)
    {
       Person y= PersonFactory.makePerson("male", "bob");
       Person z= PersonFactory.makePerson("female", "janet");
       
       System.out.println("y is " + y.getClass().getSimpleName());
       System.out.println("z is " + z.getClass().getSimpleName());
    }
}
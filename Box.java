public class Box<T>{
    
      T container;

    public T getvalue(){
        System.out.println("Method : "+ container);
        return this.container;
      
    } 
     // using getters and setters to get the value from getvalue() and return it to constructor.

    public Box(T container){
        this.container=container;
        System.out.println("Constructor : " + container);
    }
 
     public static void main(String[] args) {
        // use below code to initialize constructor or make another class like example.java
    //    Box<String> b1 =new Box<String>("Ankit");
    //    Object cd = b1.getvalue();
    //    System.out.println("After returning value : " + cd);
        
    }

    // now we can use this constructor and pass any type of value(string,int,float,char,long,double)
    // so this object type is not safe because values could be change during complile so it may crash programs
    // to get rid of this we can use type-safey with generics just we have to pass generic type to class.
    // generic type -> <T> T is the object <Integer T> -> only integer values are accepted... once it define while initializing object
    // as soon as we initialized object we have to pass value to constructor if we pass String T will become of type String
    // if we pass int during initialization of object so T will become of type integer.... during compile time.  
   public void performtask() {
        if(container instanceof String){
            System.out.println("Length of String in container : " + (((String)this.container).length()));
        }else if(container  instanceof Integer){
            System.out.println("This is integer value : " + container);
        }else{
            System.out.println("Cannot detected");
        }
   }

}


public class Example {
    public static void main(String[] args) {
        
       Box<String> box = new Box<String>("Ankit");
    //    box.container=123;
    // now it is providing type-safety after giving generic type so (box.container) will not work. 
    //    setting values during run-time so 'water' will add to constructor and '213' will add to method;
         box.getvalue();
    //    System.out.println(cf);
       
    //   to know which type(int,string,float,char...) of value is passing to container variable. use below code.. 
    // box is a class contains variable container get his class using(getClass()) and display his name using (getName())  
       System.out.println(box.container.getClass().getName());
      
      
      
       Box<Integer> box1 = new Box<Integer>(123);
    //    Box<Integer> box1 = new Box<we can remove generic type in new version>(123);
        box1.getvalue();
    //    System.out.println(cf1);
       System.out.println(box1.container.getClass().getName());

       Box<Boolean> box2 = new Box<Boolean>(true);
        box2.getvalue();

       box.performtask();
       box1.performtask();
       box2.performtask();

    }

   
}

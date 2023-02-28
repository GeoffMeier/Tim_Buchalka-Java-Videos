package theCompositionChallenge;

public class SmartKitchen  {
  private  CoffeeMaker coffeeMaker;
    private  Refridgerator refridgerator;
   private DishWasher dishWasher;

   public SmartKitchen(){
       coffeeMaker = new CoffeeMaker();
       refridgerator =new Refridgerator();
       dishWasher = new DishWasher();
   }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Refridgerator getRefridgerator() {
        return refridgerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
class Refridgerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Run dishwasher");
            hasWorkToDo = false;
        }
    }
}

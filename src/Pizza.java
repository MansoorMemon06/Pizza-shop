public class Pizza {
    private  int price;
    private  Boolean veg ;

    private int extracheeseprice=  100;
    private int extraToppings=150;
    private int Backpack =40;

    private int BasePizzaPrice=3000;
    private  boolean isExtraCheese=false;
    private  boolean isExtraTopping=false;
    private  boolean isBackpack=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 3000;
        }else {
            this.price = 5000;
        }
        BasePizzaPrice=this.price;
    }

    public void addExtraCheese(){
       isExtraCheese=true;
        System.out.println("Adding cheese to the pizza ");
        this.price +=this.extracheeseprice;


    }
    public void addExtraToppings(){
        isExtraTopping=true;
        System.out.println("Adding toppings to the pizza ");
        this.price+=this.extraToppings;

    }

    public void takeaway(){
        isBackpack=true;
        System.out.println("Taking away from the pizza ");
        this.price += this.Backpack;


    }
    public void getBill(){
        String bill="";
        System.out.println("pizza:"+BasePizzaPrice);
        if(isExtraCheese){
            bill+="extra cheese"+extracheeseprice+"\n";
        }
        if(isExtraTopping){
            bill+="extra topping"+extraToppings+"\n";
        }
        if (isBackpack){
            bill+="backpack"+Backpack+"\n";
        }
      bill+="bill:"+this.price+"\n";
        System.out.println(bill);

    }




}

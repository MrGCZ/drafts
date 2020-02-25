package iterator;

public class PancakeHouseMenu implements Menu {
    MenuItem[] menuItems;
    int numberOfItems = 0;
    static final int MAX_ITEMS = 10;

    public PancakeHouseMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("regular pancake",false,3.49);
        addItem("blueberry pancake",true,2.99);
        addItem("waffles",true,3.59);
    }

    public void addItem(String name,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,vegetarian,price);

        if (numberOfItems >= MAX_ITEMS){
            System.out.println("Sorry, menu is full");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}

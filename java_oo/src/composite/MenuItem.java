package composite;
//Leaf节点的实现，leaf节点不存在子节点，所以不用实现getChild方法
public class MenuItem extends MenuComponet {
    String name;
    double price;

    public MenuItem(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void print(){
        System.out.println(getName()+" Price: $"+getPrice());
    }

}

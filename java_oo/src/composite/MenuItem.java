package composite;
//Leaf�ڵ��ʵ�֣�leaf�ڵ㲻�����ӽڵ㣬���Բ���ʵ��getChild����
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

package iterator;

public class Waitress {
    Menu menu;
    //Waitress调用pancakeHoueseMenu可以再抽象化一点，所以变为调用其Menu接口
    public Waitress(Menu menu){
        this.menu = menu;
    }

    public void printMenu(){
        Iterator pancakeIterator = menu.createIterator(); //返回menu的迭代器
        printMenu(pancakeIterator);
    }

    //只要实现了Iterator接口的集合（无论是Array,ArrayList,Stack等都可以在这里循环便利）
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
        }
    }
}

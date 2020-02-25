package iterator;
//迭代器模式：提供一种方法顺序访问聚合对象中的各个元素。
public class IteratroRun {
    public static void main(String args[]){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu);

        waitress.printMenu();
    }

}

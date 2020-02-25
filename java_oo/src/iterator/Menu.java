package iterator;
//为所有的Menu定义一个接口，在调用这个接口的程序那边可以实现抽象化
public interface Menu {
    public Iterator createIterator();
}

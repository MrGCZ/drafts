package iterator;
//自建一个Iterator接口,给数组Array实现迭代器的功能，实现两个方法hasNext()和next()
// 其实java自带迭代器的接口java.util.Iterator
public interface Iterator {
    boolean hasNext();
    Object next();
}

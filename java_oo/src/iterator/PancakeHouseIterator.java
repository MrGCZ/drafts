package iterator;
//迭代器接口，实现不同的集合用同一种方式遍历，而不用暴露集合的内部结构。
//把遍历集合的任务交给迭代器实现，而不是直接在集合内部实现，让‘一个类只实现一种功能’
public class PancakeHouseIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public PancakeHouseIterator(MenuItem[] items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items[position];
        position = position + 1;
        return  menuItem;

    }

    public boolean hasNext(){
        if (position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }

    }
}

package composite;
//组合模式：允许用树形结构来表示整体/部分，组合（根, Composite）和叶（末节，leaf）实现组件（Component）的同一接口，以便于可以用同一方式操作根和叶。
public abstract class MenuComponet {
        public void add(MenuComponet menuComponet){
            throw new UnsupportedOperationException();
        }

        public MenuComponet getChild(int i){
            throw new UnsupportedOperationException();
        }

        public String getName(){
            throw new UnsupportedOperationException();
        }

        public double getPrice(){
            throw new UnsupportedOperationException();
        }

        public void print(){
            throw new UnsupportedOperationException();
        }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aless
 */
public class FlowerContainer implements IContainer {

    private List<String> flowerList = new ArrayList();

    public FlowerContainer() {
        flowerList.add("rose");
        flowerList.add("daffodil");
    }

    @Override
    public IIterator createIterator() {
        FlowerIterator result = new FlowerIterator();
        return result;
    }

    private class FlowerIterator implements IIterator {

        private int position;

        @Override
        public boolean hasNext() {
            return flowerList.size() > 0;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                String flower = flowerList.get(0);
                flowerList.remove(0);
                return flower;
            }else{
                return null;
            }

        }

    }

}

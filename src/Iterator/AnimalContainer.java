/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author aless
 */
public class AnimalContainer implements IContainer {

    private String animals[] = {"dog", "cat", "monkey", "lion"};

    public IIterator createIterator() {
        AnimalIterator result = new AnimalIterator();
        return result;
    }

    private class AnimalIterator implements IIterator {

        private int position;

        @Override
        public boolean hasNext() {
            if (position < animals.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return animals[position++];
            else
                return null;
        }
    }
}

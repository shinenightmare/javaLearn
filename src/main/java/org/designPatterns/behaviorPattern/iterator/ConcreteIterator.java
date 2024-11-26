package org.designPatterns.behaviorPattern.iterator;

import java.util.List;

class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = items.get(position);
            position++;
            return item;
        }
        throw new IndexOutOfBoundsException("No more elements");
    }
}

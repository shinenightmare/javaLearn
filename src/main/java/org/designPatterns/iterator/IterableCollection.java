package org.designPatterns.iterator;

interface IterableCollection<T> {
    Iterator<T> createIterator();
}

package org.designPatterns.behaviorPattern.iterator;

interface IterableCollection<T> {
    Iterator<T> createIterator();
}

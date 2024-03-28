package org.designPatterns.iterator;

interface Iterator<T> {
    boolean hasNext();

    T next();
}

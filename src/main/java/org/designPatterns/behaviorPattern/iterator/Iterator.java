package org.designPatterns.behaviorPattern.iterator;

interface Iterator<T> {
    boolean hasNext();

    T next();
}

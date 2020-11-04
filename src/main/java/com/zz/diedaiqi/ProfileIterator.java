package com.zz.diedaiqi;

/**
 * @since 1.0
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}

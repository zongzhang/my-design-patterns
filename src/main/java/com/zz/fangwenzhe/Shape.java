package com.zz.fangwenzhe;

/**
 * @since 1.0
 */
public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}

package com.example.designpatternsdemo.Behavioral.Iterator;

public interface Iterator {
    //hasNext()方法主要用于循环终止条件。
    boolean hasNext();

    //next()方法用于返回集合中的一个元素，并且为了在下次调用next方法时正确地反回下一个元素，
    //在该方法中还需将迭代器移动至下一个元素的处理。
    Object next();
}

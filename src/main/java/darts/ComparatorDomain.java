package darts;

/**
 * Double-Array Trie System
 *
 * <p>
 * Copyright(C) 2016 lee &lt;627004546@qq.com&gt;
 * </p>
 *
 * <p>
 * License (the "BSD").
 * </p>
 */

import java.util.Comparator;

public class ComparatorDomain implements Comparator{
    public int compare(Object arg0, Object arg1) {
        Domain Domain0=(Domain)arg0;
        Domain Domain1=(Domain)arg1;
        return Domain0.getUrl().compareTo(Domain1.getUrl());
    }
}

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

package darts;

import java.util.Comparator;

public class ComparatorDomain implements Comparator{
    /** Comparator接口重写 */
    public int compare(Object arg0, Object arg1) {
        Domain Domain0=(Domain)arg0;
        Domain Domain1=(Domain)arg1;
        return Domain0.getUrl().compareTo(Domain1.getUrl());
    }
}

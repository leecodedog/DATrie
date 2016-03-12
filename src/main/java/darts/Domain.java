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

public class Domain {
    String name;
    String url;

    public Domain(String url,String name){
        this.name=name;
        this.url=url;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String age) {
        this.url = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

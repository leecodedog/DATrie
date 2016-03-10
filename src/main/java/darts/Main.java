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

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String filename = "/home/lee/IdeaProjects/DATrie/src/main/resources/data.csv";
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename), "GB2312"));
        String line;
        List words = new ArrayList();
        List<String> keys = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            String[] sourceStrArray=line.split(",");
            words.add(new Domain(sourceStrArray[0],sourceStrArray[1]));
            keys.add(sourceStrArray[0]);
        }
        reader.close();
        // 将字典序列按字典序排序
        ComparatorDomain comparator=new ComparatorDomain();
        Collections.sort(words, comparator);
        Collections.sort(keys);
        DoubleArrayTrie dat = new DoubleArrayTrie();
        dat.build(keys);  //构建双数组字典树
        //测试
        int k = dat.exactMatchSearch("www.baidu.com");
        Domain temp=(Domain)words.get(k);
        System.out.print(temp.getName());

    }
}

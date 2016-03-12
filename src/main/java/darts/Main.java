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

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String line;
        List words = new ArrayList();
        List<String> keys = new ArrayList<String>();

        String filename = "/home/lee/IdeaProjects/DATrie/src/main/resources/traindata.csv";
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename), "GB2312"));

        // 构造输入数据
        while ((line = reader.readLine()) != null) {
            String[] sourceStrArray = line.split(",");
            String domain = sourceStrArray[0]  ;
            sourceStrArray[0] = domain.replace("www.","");

            words.add(new Domain(sourceStrArray[0],sourceStrArray[1]));
            keys.add(sourceStrArray[0]);

        }

        reader.close();

        // 将字典序列按字典序排序
        ComparatorDomain comparator=new ComparatorDomain();
        Collections.sort(words, comparator);
        Collections.sort(keys);

        DoubleArrayTrie dat = new DoubleArrayTrie();

        long startTime=System.currentTimeMillis();
        dat.build(keys);  //构建双数组字典树
        long endTime=System.currentTimeMillis();

        System.out.println("构建字典树运行时间： "+(endTime-startTime)+"ms");

        //测试
        int k;
        for (int i = 0; i < 10; i++) {
            String testdata = "m-."+keys.get(i)+"/html";
            k = dat.exactMatchSearch(testdata);

            if (k!=-1){
                Domain temp=(Domain)words.get(k);

                System.out.print("\n");
                System.out.print(temp.getName()+ "  "+ temp.getUrl()+ "  " + testdata);
            }

        }


    }

}

# DATrie 

## 方法说明
* 生成trie树：DoubleArrayTrie.build()
* 查找：DoubleArrayTrie.exactMatchSearch()

## TODO
* 目前还无法动态插入
* url解析主机名规则不完善，仅考虑了不包含协议情况

## 参考文献
* [An Efficient Implementation of Trie Structures](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.14.8665&rep=rep1&type=pdf)
* [wiki-trie树](https://en.wikipedia.org/wiki/Trie)
* [博客《双数组Trie树(DoubleArrayTrie)Java实现》](http://www.hankcs.com/program/java/%E5%8F%8C%E6%95%B0%E7%BB%84trie%E6%A0%91doublearraytriejava%E5%AE%9E%E7%8E%B0.html)

## 数据详情
* 共计50226个网址,来源自[chinaz.com](http://top.chinaz.com/all/)
* 编码格式是GB2312，windows下生成,请注意换行符问题
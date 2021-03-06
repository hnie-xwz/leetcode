## 题目

```java

 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。

 示例 1：
 输入： 2
 输出： 2
 解释： 有两种方法可以爬到楼顶。
 1.  1 阶 + 1 阶
 2.  2 阶

 示例 2：
 输入： 3
 输出： 3
 解释： 有三种方法可以爬到楼顶。
 1.  1 阶 + 1 阶 + 1 阶
 2.  1 阶 + 2 阶
 3.  2 阶 + 1 阶

```



- 用到的公式

$$
C_n^m =\frac{n!}{m!(n-m)!}
$$

### 分析n=3

#### 3

`1 1 1` 

结果：
$$
C_3^0=1
$$


#### 2

`1 2` 

`2 1`
$$
C_2^1=2
$$


#### 结论

每个数字分别能组合的方法数为 

`1 2`

### 分析n=4

#### 4

`1 1 1 1`
$$
C_4^0
$$


#### 3

`1 1 2`

`1 2 1`

`2 1 1`
$$
C_3^1=3
$$


#### 2

`2 2`
$$
C_2^2=1
$$


#### 结论

每个数字分别能组合的方法数为 

`1 3 1`

### 分析n=5

#### 5

`1 1 1 1 1`

#### 4

`1 1 1 2`

`1 1 2 1`

`1 2 1 1`

`2 1 1 1`
$$
C_4^1=4
$$


#### 3

`1 2 2`

`2 1 2`

`2 2 1`
$$
C_3^2
$$


#### 结论

每个数字分别能组合的方法数为 

`1 4 3`

### 分析n=6

#### 6

`1 1 1 1 1 1`

#### 5

`1 1 1 1 2`

`1 1 1 2 1`

`1 1 2 1 1`

`1 2 1 1 1`

`2 1 1 1 1`
$$
C_5^1=5
$$


#### 4

`1 1 2 2`

`1 2 1 2`

`1 2 2 1`

`2 1 1 2`

`2 1 2 1`

`2 2 1 1`
$$
C_4^2=6
$$


总数为：`3+3=6`

#### 3

`2 2 2`

#### 结论

每个数字分别能组合的方法数为 

`1 5 6 1`

### 分析n=7

#### 7

`1 1 1 1 1 1 1`

#### 6

`1 1 1 1 1 2`

`1 1 1 1 2 1`

`1 1 1 2 1 1`

`1 1 2 1 1 1`

`1 2 1 1 1 1`

`2 1 1 1 1 1`

总数·`6`

#### 5

`1 1 1 2 2`

`1 1 2 1 2`

`1 1 2 2 1`

`1 2 1 1 2`

`1 2 1 2 1`

`1 2 2 1 1`

`2 1 1 1 2`

`2 1 1 2 1`

`2 1 2 1 1`

`2 2 1 1 1`

总个数为`1+2+3+4=（（5-1）*5）/2=10`
$$
C_5^2=\frac{5!}{2!(5-2)!}=\frac{4*5}{2}=10
$$


其中有两个2，结果就是两个数相乘的结果除以2

#### 4

`1 2 2 2`

`2 1 2 2`

`2 2 1 2`

`2 2 2 1`

总数为`1+3=4`
$$
C_4^3=4
$$


#### 结论

`1 6 10 4`

### 分析n=8

#### 8

`1 1 1 1 1 1 1 1`
$$
C_8^0=1
$$


#### 7

`1 1 1 1 1 1 2`

`1 1 1 1 1 2 1`

`...`
$$
C_7^1=7
$$


总数：`7` 对应**1**个2

#### 6

`1 1 1 1 2 2`

`1 1 1 2 1 2`

`1 1 1 2 2 1`

`1 1 2 1 1 2`

`1 1 2 1 2 1`

`1 1 2 2 1 1`

`1 2 1 1 1 2`

`1 2 1 1 2 1`

`1 2 1 2 1 1`

`1 2 2 1 1 1`

`2 1 1 1 1 2`

`2 1 1 1 2 1`

`2 1 1 2 1 1`

`2 1 2 1 1 1`

`2 2 1 1 1 1`
$$
C_6^2=15
$$


总数：`1+2+3+4+5=15` 对应**2**个2

#### 5

`1 1 2 2 2`

`1 2 1 2 2`

`1 2 2 1 2`

`1 2 2 2 1`

`2 1 1 2 2`

`2 1 2 1 2`

`2 1 2 2 1`

`2 2 1 1 2`

`2 2 1 2 1`

`2 2 2 1 1`
$$
C_5^3=\frac{3*4*5}{1*2*3}=10
$$


总数为：`10` 

#### 4

`2 2 2 2`

对应**4**个2

#### 结论

`1 7 15 10 1`

### 分析n=9

#### 9

$$
C_9^0=1
$$



#### 8

$$
C_8^1=8
$$



#### 7

```
1 1 1 1 1 2 2
...
```

$$
C_7^2= \frac{7!}{2!(7-2)!}=\frac{6*7}{2}=21
$$


#### 6

```
1 1 1 2 2 2

1 1 2 1 2 2
1 1 2 2 1 2
1 1 2 2 2 1

1 2 1 1 2 2
1 2 1 2 1 2
1 2 1 2 2 1
1 2 2 1 1 2
1 2 2 1 2 1
1 2 2 2 1 1

2 1 1 1 2 2

1 1 1 2 2 2 2
1 1 2 1 2 2 2
1 1 2 2 1 2 2
1 1 2 2 2 1 2
1 1 2 2 2 2 2
```

$$
C_6^3=20
$$



总数为：`1+（1+2）+（1+2+3）+（1+2+3+4）=20`

#### 5

```
1 2 2 2 2
2 1 2 2 2
2 2 1 2 2
2 2 2 1 2
2 2 2 2 1
```

$$
C_5^4=5
$$



### 总结

- 每一个数都可以用和他等值的`1`相加，这样的结果只有一个
- 对于n来说，它最少可以有`n/2+1`个数字相加

- 每个数字可以使用的方法为：

  ```
  1:1
  2:1+1
  3:1+2
  4:1+3+1
  5:1+4+3
  6:1+5+6+1
  7:1+6+10+4
  8:1+7+15+10+1
  9:1+8+20+21+20+5
  ...
  从上往下看，每一位相加的数都是递增的，是个等差数列
  ```

- 根据上面数据可以看出对于n，可以对应的结果可以由一下几个数字相加

  + 第0位 ：1+0  `1+0*（n-0）`

  + 第1位：1+1 加了n-1-1次  `1+1*（n-2）`

  + 第2位：1+2 加了n-3-1次`1+2*（n-4）`

  + 第3位：1+3 加了n-6   次 `1+3*（n-6）`
  + ... 依次类推
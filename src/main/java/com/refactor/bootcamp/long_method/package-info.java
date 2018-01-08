package com.refactor.bootcamp.long_method;
/*
 * 过长的函数
 * 很久之前程序员就已经认识到程序越长越难理解，在早期编程语言，调用子程序需要额外开销，所以不愿意使用小函数.
 * 现在OO语言几乎已经完全免除了进程内的调用动作开销.
 *
 * 原则：
 * 每当感觉需要注释说明点什么的时候，就可以把需要说明的东西写进一个独立函数中，并以其"用途"命名,哪怕函数名比实现还要长，
 * 关键是要说明"用途"
 *
 * 1.无局部变量
 *   ->利用Extract Method 提炼函数即可
 * 2.有局部变量
 *   ->如果发现局部变量是保存某一个表达式的运算结果，
 *   那么用一个查询函数(Replace Temp with Query)替换使结构清晰后，在Extract Method
 *   ->Extract Method 提炼函数
 *   ->观察新函数如果对参数赋值了,应用Remove Assignments to Parameters
 *
 *
 */
package com.refactor.bootcamp.duplicated_code;
/*
 * 坏味道首当气冲的就是duplicated Code，如果你在一个以上的地点看到相同的重复结构，那么这个坏味道就可以确定了，设法将它们合而为一。
 *
 * 1.同一个类中两个或更多的函数，含有相同的表达式
 *   ->利用Extract Method 提炼重复代码，然后引用新提炼的函数
 *
 * 2.互为兄弟的子类，含有相同的表达式。
 *   ->利用Extract Method 提炼重复代码，然后用Pull Up Method 推到超类
 *
 * 3.互为兄弟的子类，含有部分相同的表达式
 *   ->利用Extract Method 提炼重复的,可能发现是可以运用From Template Method (Template Method 设计模式)
 *
 * 4.有些函数以不用的算法做相同的事
 *   ->使用 Substitute Algorithm 将其他函数替换掉
 *
 * 5.两个互不相干的类出现 Duplicated Code
 *   -> 利用Extract Class 将重复代码提炼到一个独立的类中,然后引用新类,
 *   或者这个函数就是属于原来的某个类，
 *   那么可能就不是互不相干的类之间的引用了
 */
package com.refactor.bootcamp.switch_statement;
/*
 * 你常会发现switch语句散布于不同地点。如果要为它添加一个新的case子句
 * 就必须找到所有switch语句并修改它们。面向对象中的多态概念可为此带来优雅的解决办法。

 * 1.条件表达式，它根据类型的不同而选择不同的行为。
 *  ->Replace Conditional with Polymorphism （以多态取代条件表达式）
 * 2.有个类型码，它会影响行为，但你无法通过继承的方式消除它，或者类型码的数值在对象的生命周期中发生变化
 *  ->Replace Type Code with State/Strategy （以状态/策略取代类型码）
 * 3.如果单一函数 有些选择事例,且不想改动它们,那么多态就有点杀鸡用牛刀了
 *  ->Replace Parameter with Explicit Methods （以明确函数取代参数）
 * 把“对不同行为的了解”从类用户那转移到了类自身。如果需要再加入新的行为变化，只需要添加一个子类就行了。
 * 如果没有多态机制，就必须找到所有条件表达式，并逐一修改它们。因此，如果为了还有可能加入新行为，这项重构将特别有价值。
 */
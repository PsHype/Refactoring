package com.refactor.bootcamp.primitive_obsession;
/*
* 基本类型的偏执(痴迷)
* 大多数编程环境都有两种数据:结构类型允许你将数据组织称有意义的形式；基本类型则是构成结构类型的积木,结构总是会带来一定的额外开销。
* 他们可能代表这数据库中表,如果只为了做一两件事而创建结构类型也可能显得太麻烦。
*
* 对象的一个极大的价值在于:它们模糊(甚至打破)了横亘于基本数据和体积较大的类的之前的界限。你可以轻松编写出一些与语言内置(基本)类型
* 无异的小型类，例如，Java就以基本类型表示数值,而以类表示字符串和日期-------这两个类型在其他需多编程环境中都以基本类型表现.
*
* 对象技术的新手通常不愿意在小任务上运动小对象---像是结合数值和币种的money类，有一个起始值和一个结束值组成的range类，电话号码
* 或邮政编码(ZIP)等特殊字符
*
* 你可以运用Replace Data Value with Object 将原本单独存在的数据值替换为对象,从而走出传统的洞窟,进入炙手可热的对象世界.
*
* 如果想要替换的数据值是类型码，而它不影响行为
* 则可以运用Replace Type Code with Class将它换掉.
*
* 如果你有与类型码相关的条件表达式可以运用
* Replace Type Code with SubClass 或者 Replace Type Code with state/Strategy 加以处理。
*
* 如果你有一组总是被放在一起的字段，可以运用Extract Class
*
* 如果在参数列中看到基本数据类型，不妨试试Introduce Parameter Object
*
* 如果你发现自己正从数组中挑选数据,可以运用 Replace Array with Object
*
*
*/
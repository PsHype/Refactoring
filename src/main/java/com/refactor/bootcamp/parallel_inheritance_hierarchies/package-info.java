package com.refactor.bootcamp.parallel_inheritance_hierarchies;
/*
* 平行继承体系其实是散弹式修改的特殊情况.
* 在这种情况下，每当你为某个类增加一个子类,必须也为另一个类。
* 如果你发现某个继承体系的类名称前缀和另一个继承体系的类名称前缀完全相同，便是闻到了这种坏味道
*
* 消除这种重复性的一般策略是:让一个继承体系的实例引用另一个继承体系的实例,如果在运用Move Method 和Move Field
* 就可以将引用端的继承体系消弭于无形.
*/
package com.refactor.bootcamp.long_parameter_list;
/*
* 过长的参数列
* 刚开始学习编程的时候，我们总是把函数需要的东西全部以参数的形式传递进去,
* 这可以理解，因为除此之外就只能选择全局数据，而全局数据是个邪恶的东西。
* 对象技术改变了这一情况:如果你手上没有所需的东西,总可以叫另一个对象给你,
* 有了对象，你就不必把函数需要的所有东西都以参数传递给它了，只需要传给它足够的
* 让函数能从中获得自己需要的东西就就行了。
*
* 因为太长的参数列难以理解，太多的参数会造成前后不一致，不易使用，
* 而且一旦你需要更多的数据，就不得不修改它。如果将对象传递给函数，
* 大多数修改都将没有必要，因为你很可能只需要在函数内增加一两条请求，就能得到更多数据
*
* 如果向已有的对象发出一条请求，就可以取代一个参数，
* 那么你应该激活手法 Replace Parameter with Method.在这里"已有对象"可能是函数所属类内的一个字段
* 也可能是另一个参数。
*
* 你也可以运用 Preserve Whole Object 将来自同一个对象的一堆数据收集起来，并以该对象替换它们。
* 如果某些数据缺乏合理的对象归属，可使用Introduce Parameter Object 为它们制造出一个参数对象
*
* 这里有一个重要的例外:有时候你明显不希望造成"被调用对象"与"较大对象"间的某种依赖关系.
* 这时候将参数句从对象中拆解出来单独作为参数，也很合情合理。但是请注意其所引发的代码。
* 如果参数列太长或变化踢啊频繁，你就需要重新考虑自己的依赖结构了。
*
*
*
*/

##过度耦合的消息链
####症状
>如果你看到用户向一个对象请求另一个对象,然后在向后者请求另一个对象，然后在请求另一个对象类似：<code>getPerson().getDepartment().getAddress().getStreet()</code>这就是消息链


####症状的原因
>实际代码中你看到的可能是一长串getThis()或一长串临时变量.
采取这种方式，意味者客户端代码将与查找过程中的链条结构紧密耦合.
***一旦链条间的任何对象发生变化,客户端就不得不做出相应修改***.

![message chains](https://refactoring.guru/images/refactoring/content/smells/message-chains-01-2x.png)
###重构手法
* Hide Delegate

>-对于每个委托关系中的函数,在服务对象端建立一个简单的委托函数

>-调整客户端，令它只调用服务对象提供的简单委托函数

>- 如果使用者和服务提供者不在同一个包，考虑修改简单委托函数的访问权限,让客户端


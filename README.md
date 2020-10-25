# head first 设计模式笔记
## 常用模式
### 策略模式  
定义算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
### 观察者模式
在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。
### 单件模式
确保一个类只有一个实例，并提供全局访问点
### 工厂模式
定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
### 装饰者模式
动态的将责任附加到对象上，想要扩展功能，装饰者提供有别于继承的另一种选择。
### 命令模式
将请求封装成对象，这可以让你使用不同的请求，队列，或者日志请求来参数化其他对象。命令模式也可以支持撤销操作。
### 适配器模式
将一个类的接口，转换成客户期望的另一个接口。适配器让原本不兼容的类可以合作无间。
### 外观模式
提供了一个统一的接口，用来访问子系统中一群接口。外观定义了一个高层接口，让子系统更容易使用。
### 模板方法模式
在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
### 迭代器模式
提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。
### 组合模式
允许你将对象组成树形结构来表现“整体/部分”的层次结构。组合能让客户以一致的方式处理个别对象和对象组合。
### 状态模式
允许对象在内部状态改变时改变他的行为，对象看起来好像修改了他的类。
### 代理模式
为另一个对象提供一个替身或占位符以访问这个对象。
### 复合模式
结合两个或以上的模式，组成一个解决方案，解决一再发生的一般性问题。
### 桥接模式
不只改变你的实现，也改变你的抽象
### 责任链模式
当你想要让一个以上的对象有机会更够处理某个请求的时候，就使用责任链模式
### 备忘录模式
当你需要让对象返回之前的状态时（例如，你的用户请求“撤销”），就使用备忘录模式
### 原型模式
当创建给定的实例的过程很昂贵或很复杂时，就使用原型模式
### 访问者模式
当你想要为一个对象的组合增加新的能力，且封装并不重要时，就使用访问者模式

## 分类
### 创建型
工厂方法模式  
抽象工厂模式  
生成器模式  
原型模式  
单例模式  

### 结构型
适配器模式  
桥接模式  
组合模式  
装饰模式  
外观模式  
享元模式  
代码模式  

### 行为型
责任链模式  
命令模式  
迭代器模式  
中介者模式  
备忘录模式  
观察者模式  
状态模式  
策略模式  
模版方法模式  
访问者模式  


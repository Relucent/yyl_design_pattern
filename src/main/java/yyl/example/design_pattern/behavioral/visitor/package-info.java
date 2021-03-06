/**
 * 在访问者(Visitor)模式：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。<br>
 * 使用了一个访问者类，它改变了元素类的执行算法。 通过这种方式，元素的执行算法可以随着访问者改变而改变。 <br>
 */
package yyl.example.design_pattern.behavioral.visitor;

// 意图：主要将数据结构与数据操作分离

// 相关角色： 
// 抽象访问者(Visitor)：抽象出访问元素的动作
// 具体访问者(ConcreteVisitor)：实现访问元素的动作
// 抽象元素(Element)：定义一个接受访问的操作，其参数为访问者
// 具体元素(ConcreteElement)：实现接受访问操作
// 对象结构类(ObjectStructure)：可以枚举元素，并且管理元素
// 客户端(Client) ：定义元素集合，然后接受不同访问者的访问
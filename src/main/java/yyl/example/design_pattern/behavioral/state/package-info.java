/**
 * 状态(State)模式 Pattern，允许一个对象在其内部状态改变时改变它的行为。
 */
package yyl.example.design_pattern.behavioral.state;

// 环境类（Context）:  定义客户感兴趣的接口。维护一个ConcreteState子类的实例，这个实例定义当前状态。
// 抽象状态类（State）:  定义一个接口以封装与Context的一个特定状态相关的行为。
// 具体状态类（ConcreteState）:  每一子类实现一个与Context的一个状态相关的行为。
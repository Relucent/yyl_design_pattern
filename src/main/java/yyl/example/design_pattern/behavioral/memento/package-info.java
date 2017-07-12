/**
 * 备忘录模式(Memento)：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。<br>
 */
package yyl.example.design_pattern.behavioral.memento;

// 备忘录模式包含3个角色：
// 1. Originator(发起人)：负责创建一个备忘录，用以记录当前时刻自身的内部状态，并可使用备忘录恢复内部状态。
// 2. Memento(备忘录)：负责存储发起人的内部状态，并可以防止Originator以外的其他对象访问备忘录。
// 3. Caretaker(管理者)：负责备将备忘录传递给其他对象。
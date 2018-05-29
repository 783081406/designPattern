/**
 * 备忘录模式：
 * memento模式也叫做备忘录模式，是行为模式之一，他的作用是保存对象的内部状态，
 * 并需要的时候(undo/rollback)恢复对象以前的状态
 * <p>
 * 应用场景：
 * 如果一个对象需要保存状态并可以通过undo或rollback等操作恢复到以前的状态时，可以使用Memento模式.
 * 1)一个类需要保存它的对象的状态(相当于Originator角色)
 * 2)设计一个类.该类只能用来保存上述对象的状态(相当于Memento角色)
 * 3)需要的时候，Caretaker角色要求Originator返回一个Memento加以保存
 * 4)undo或rollback操作时，通过Caretaker保存的Memento恢复Originator对象的状态
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.memento;
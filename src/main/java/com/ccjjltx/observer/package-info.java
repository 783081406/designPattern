/**
 * 观察者模式：
 * Observer模式是欣慰模式之一，作用是当一个对象的状态发生变化时，能自动通知其他关联对象，
 * 自动刷新对象状态
 * Observer模式提供给关联对象一种同步通信的手段，使某个对象与依赖它的其他对象之间保持同步
 * <p>
 * Subject(被观察者)
 * 被观察者的对象。当需要被观察的状态发生改变时，需要通知队列中所有观察者对象。
 * Subject需要维持(添加,删除,通知)一个观察者对象的队列列表
 * ConcreateSubject
 * 给观察者的具体实现。包含一些基本的属性状态以及其他操作
 * Observer(观察者)
 * 接口或抽象类。当Subject的状态发生改变时，Observer对象通过一个callback函数得到通知
 * ConcreteObserver
 * 观察者的具体实现。得到通知后将完成一些具体的业务逻辑处理。
 * <p>
 * java.util.Observable
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.observer;
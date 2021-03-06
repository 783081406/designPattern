/**
 * 命令模式
 * Command模式也叫命令模式,是行为设计模式的一种.
 * Command模式通常被称为Command的类封装了对目标对象的调用行为以及调用参数
 * <p>
 * 应用场景：
 * 在面对对象的设计中，一个对象调用另一个对象，一般情况下调用过程是：创建目标对象实例；
 * 设置调用参数：调用目标方法。
 * 但在有些情况下有必要使用一个专门的类对这种调用过程加以封装，这种专门的类称为command类。
 * 整个调用过程比较复杂，或者存在多处这种调用。这时，使用command类对该调用加以封装，便于功能的在利用
 * <p>
 * -调用前后需要对调用参数进行某些处理
 * 调用前后需要进行某些额外处理，比如日志，缓存，记录历史操作等。
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.command;
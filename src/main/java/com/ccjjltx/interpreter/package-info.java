/**
 * Interpreter模式也叫解释器模式，是行为模式之一，它是一种特殊的设计模式，它建立一个解释器
 * 对于特定的计算机程序设计语言，用来解释预先定义的方法。简单地说，Interpreter是一种简单的语法解释器架构
 * 该文法简答对于复杂的文法，文法的类层次变得庞大而无法管理。此时语法分析程序生成器这样的工具是更好的选择
 * 他们无需构建抽象语法树即可解释表达式，这样可以节省空间而且还能节省时间.
 * <p>
 * Context
 * 解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等
 * AbstractException
 * 解释器抽象类
 * ConcreteExpression
 * 解释器具体实现类
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.interpreter;
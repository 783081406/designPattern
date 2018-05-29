/**
 * 策略模式：
 * Strategy模式也叫策略模式是行为模式之一,它对一系列的算法加以封装,为所有算法定义一个抽象的算法接口，
 * 并通继承该抽象算法接口对所有的算法加以封装和实现，具体的算法选择交由客户端决定(策略).
 * Strategy模式主要用到平滑地处理算法的切换
 * <p>
 * 角色和职责
 * Strategy:
 * 策略(算法)抽象
 * ConcreteStrategy:
 * 各种策略(算法)的具体实现
 * Context
 * 策略的外部封装类，或者说策略的容器类。根据不同策略执行不同的欣慰。策略由外部环境决定
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.strategy;
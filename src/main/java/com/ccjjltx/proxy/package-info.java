/**
 * Proxy模式又叫做代理模式，是构造型的设计模式之一，他可以为其他对象提供一种代理(Proxy)以控制对这个对象的访问
 * 所谓代理，是指具有与代理元(被代理的对象)具有相同的接口的类，客户端必须通过代理与被代理的目标类交付，
 * 而代理一般在交付的过程中(交互前后),进行某些特别的处理
 * <p>
 * subject(抽象主体角色)
 * 真实主体与代理主体的共同接口
 * RealSubject(真实主题角色)
 * 定义了代理角色所代表的真实对象
 * Proxy(代理主题角色)
 * 含有对真实主体角色的引用，代理角色通常在将客户端调用传递给真实主体对象之前或者之后执行某些操作，
 * 而不是单纯返回真实的对象
 *
 * @author ccj
 * @version 1.0
 * @since 1.8
 */
package com.ccjjltx.proxy;
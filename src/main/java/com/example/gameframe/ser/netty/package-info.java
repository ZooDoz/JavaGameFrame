/**
 * netty的demo
 * 和具体的引擎无关
 * 在netty的服务中，构建一套context和一组clients
 * 通过下发context来处理数据，然后根据返回数据调用clients返回给各个客户端
 * netty中还应该包含超时检测，安全结构，协议处理，用户管理等
 */
/**
 * @author zoodoz
 *
 */
package com.example.gameframe.ser.netty;
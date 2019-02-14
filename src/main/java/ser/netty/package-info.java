/**
 * netty的demo
 * 和具体的引擎无关
 * 在netty的服务中，生成所有连接的context上下文
 * 并通过封装req和resp来传递解析出来的数据以及对应sessionId
 * 并处理返回的数据
 * netty中还应该包含超时检测，安全结构，协议处理，用户管理等
 */
/**
 * @author zoodoz
 *
 */
package s.ser.netty;
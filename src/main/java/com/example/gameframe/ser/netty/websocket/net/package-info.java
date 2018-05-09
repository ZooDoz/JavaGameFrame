/**
 * 这是net的适配器包
 * 这个包中有调用net层的接口
 * 也应该包括对原始数据下发交给底层解析的接口
 * 目前由ser层使用默认的解析方式来解析
 * 后续会在适配器中允许注入net层的自定义解析器
 */
package com.example.gameframe.ser.netty.websocket.net;
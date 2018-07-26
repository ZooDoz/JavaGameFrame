package evn.EvnSave.impl;

import evn.EvnSave.Save;
import evn.EvnSave.pojo.ZSetBean;
import evn.pojo.Evn;
import evn.pojo.Object;

import java.util.List;
import java.util.Map;

/**
 * @author zoodoz
 * create date 2018/7/26
 * 基于redis的存储实现
 */
public class RedisSave implements Save {
    public Long expire(Evn e, String key, int cacheSec) {
        return null;
    }

    public boolean add(Evn e, String key, Object data) {
        return false;
    }

    public boolean set(Evn e, String key, Object data) {
        return false;
    }

    public <T> T get(Evn e, String key, Class<T> clazz) {
        return null;
    }

    public <T> T getReal(Evn e, String key, Class<T> clazz) {
        return null;
    }

    public Long getIncr(Evn e, String key) {
        return null;
    }

    public <T> Map<String, T> gets(Evn e, Class<T> clazz, String... keys) {
        return null;
    }

    public <T> Map<String, T> getsReal(Evn e, Class<T> clazz, String... keys) {
        return null;
    }

    public <T> Map<String, T> gets(Evn e, Class<T> clazz, List<String> keys) {
        return null;
    }

    public <T> Map<String, T> getsReal(Evn e, Class<T> clazz, List<String> keys) {
        return null;
    }

    public boolean delete(Evn e, String key) {
        return false;
    }

    public boolean exist(Evn e, String key, Class<?> clazz) {
        return false;
    }

    public long incr(Evn e, String key, int num) {
        return 0;
    }

    public Long ttl(Evn e, String key) {
        return null;
    }

    public boolean hAddReal(Evn e, String name, String key, Object data) {
        return false;
    }

    public boolean hSetReal(Evn e, String name, String key, Object data) {
        return false;
    }

    public boolean hMSetReal(Evn e, String name, Map<String, ?> dataMap) {
        return false;
    }

    public <T> T hGetReal(Evn e, String name, String key, Class<T> clazz) {
        return null;
    }

    public <T> Map<String, T> hGetAllReal(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public <T> Map<String, T> hMGetReal(Evn e, String name, Class<T> clazz, String... keys) {
        return null;
    }

    public boolean hAdd(Evn e, String name, String key, Object data) {
        return false;
    }

    public boolean hSet(Evn e, String name, String key, Object data) {
        return false;
    }

    public <T> T hGet(Evn e, String name, String key, Class<T> clazz) {
        return null;
    }

    public boolean hDel(Evn e, String name, String key) {
        return false;
    }

    public Long hIncr(Evn e, String name, String key, Long num) {
        return null;
    }

    public boolean hExist(Evn e, String name, String key) {
        return false;
    }

    public Long hSize(Evn e, String name) {
        return null;
    }

    public <T> Map<String, T> hGetAll(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public <T> Map<String, T> hMGet(Evn e, String name, Class<T> clazz, String... keys) {
        return null;
    }

    public boolean hMSet(Evn e, String name, Map<String, ?> dataMap) {
        return false;
    }

    public boolean hMDel(Evn e, String name, String... keys) {
        return false;
    }

    public boolean hDelAll(Evn e, String name) {
        return false;
    }

    public List<String> hKeys(Evn e, String name) {
        return null;
    }

    public <T> List<T> hValues(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public boolean zSet(Evn e, String name, String key, long score) {
        return false;
    }

    public Long zGet(Evn e, String name, String key) {
        return null;
    }

    public boolean zDel(Evn e, String name, String key) {
        return false;
    }

    public Long zIncr(Evn e, String name, String key, Long num) {
        return null;
    }

    public boolean zExist(Evn e, String name, String key) {
        return false;
    }

    public Long zSize(Evn e, String name) {
        return null;
    }

    public Long zRank(Evn e, String name, String key) {
        return null;
    }

    public Long zRRank(Evn e, String name, String key) {
        return null;
    }

    public List<ZSetBean> zRange(Evn e, String name, int start, int end) {
        return null;
    }

    public List<ZSetBean> zRRange(Evn e, String name, int start, int to) {
        return null;
    }

    public List<ZSetBean> zRangeByScore(Evn e, String name, Long minScore, Long maxScore, int offset, int count) {
        return null;
    }

    public boolean zRemByRank(Evn e, String name, int start, int end) {
        return false;
    }

    public boolean zRemByScore(Evn e, String name, Long start, Long end) {
        return false;
    }

    public boolean ZDelAll(Evn e, String name) {
        return false;
    }

    public Long zCount(Evn e, String name, Long minScore, Long maxScore) {
        return null;
    }

    public Long qPushFront(Evn e, String name, Object data) {
        return null;
    }

    public Long qPushBack(Evn e, String name, Object data) {
        return null;
    }

    public <T> T qPopFront(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public <T> T qPopBack(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public Long qPush(Evn e, String name, Object data) {
        return null;
    }

    public <T> T qPop(Evn e, String name, Class<T> clazz) {
        return null;
    }

    public Long qSize(Evn e, String name) {
        return null;
    }

    public boolean qDelAll(Evn e, String name) {
        return false;
    }

    public <T> T qGet(Evn e, String name, Integer index, Class<T> clazz) {
        return null;
    }

    public <T> List<T> qRange(Evn e, String name, int start, int end, Class<T> clazz) {
        return null;
    }

    public <T> List<T> qSlice(Evn e, String name, int start, int end, Class<T> clazz) {
        return null;
    }
}

package evn.EvnSave;

import evn.EvnSave.pojo.ZSetBean;
import evn.pojo.Evn;

import java.util.List;
import java.util.Map;

/**
 * @author zoodoz
 * create date 2018/7/12
 * 存储方法
 */
public interface Save
{
    boolean add(Evn e , String key, Object data);
    boolean set(Evn e ,String key, Object data);
    <T> T get(Evn e ,String key, Class<T> clazz);
    <T> T getReal(Evn e ,String key, Class<T> clazz);
    Long getIncr(Evn e ,String key);
    <T> Map<String, T> gets(Evn e , Class<T> clazz, String ... keys);
    <T> Map<String, T> getsReal(Evn e ,Class<T> clazz, String ... keys);
    <T> Map<String, T> gets(Evn e ,Class<T> clazz, List<String> keys);
    <T> Map<String, T> getsReal(Evn e ,Class<T> clazz, List<String> keys);
    boolean delete(Evn e ,String key);
    boolean exist(Evn e ,String key, Class<?> clazz);

    long incr(Evn e ,String key, int num);
    Long ttl(Evn e ,String key);
    Long expire(Evn e , String key, int cacheSec);

    boolean hAddReal(Evn e , String name, String key, Object data);
    boolean hSetReal(Evn e ,String name, String key, Object data);
    boolean hMSetReal(Evn e ,String name, Map<String, ?> dataMap);
    <T> T hGetReal(Evn e ,String name, String key, Class<T> clazz);
    <T> Map<String, T> hGetAllReal(Evn e ,String name, Class<T> clazz);
    <T> Map<String, T> hMGetReal(Evn e ,String name, Class<T> clazz, String ... keys);

    boolean hAdd(Evn e ,String name, String key, Object data);
    boolean hSet(Evn e ,String name, String key, Object data);
    <T> T hGet(Evn e ,String name, String key, Class<T> clazz);
    boolean hDel(Evn e ,String name, String key);
    Long hIncr(Evn e ,String name, String key, Long num);
    boolean hExist(Evn e ,String name, String key);
    Long hSize(Evn e ,String name);
    <T> Map<String, T> hGetAll(Evn e ,String name, Class<T> clazz);
    <T> Map<String, T> hMGet(Evn e ,String name, Class<T> clazz, String ... keys);
    boolean hMSet(Evn e ,String name, Map<String, ?> dataMap);
    boolean hMDel(Evn e ,String name, String ... keys);
    boolean hDelAll(Evn e ,String name);
    List<String> hKeys(Evn e , String name);
    <T> List<T> hValues(Evn e ,String name, Class<T> clazz);

    boolean zSet(Evn e ,String name, String key, long score);
    Long zGet(Evn e ,String name, String key);
    boolean zDel(Evn e ,String name, String key);
    Long zIncr(Evn e ,String name, String key, Long num);
    boolean zExist(Evn e ,String name, String key);
    Long zSize(Evn e ,String name);
    Long zRank(Evn e ,String name, String key);
    Long zRRank(Evn e ,String name, String key);
    List<ZSetBean> zRange(Evn e , String name, int start, int end);
    List<ZSetBean> zRRange(Evn e ,String name, int start, int to);
    List<ZSetBean> zRangeByScore(Evn e ,String name, Long minScore, Long maxScore, int offset, int count);
    boolean zRemByRank(Evn e ,String name, int start, int end);
    boolean zRemByScore(Evn e ,String name, Long start, Long end);
    boolean ZDelAll(Evn e ,String name);
    Long zCount(Evn e ,String name, Long minScore, Long maxScore);

    Long qPushFront(Evn e ,String name, Object data);
    Long qPushBack(Evn e ,String name, Object data);
    <T> T qPopFront(Evn e ,String name, Class<T> clazz);
    <T> T qPopBack(Evn e ,String name, Class<T> clazz);
    Long qPush(Evn e ,String name, Object data);
    <T> T qPop(Evn e ,String name, Class<T> clazz);
    Long qSize(Evn e ,String name);
    boolean qDelAll(Evn e ,String name);
    <T> T qGet(Evn e ,String name, Integer index, Class<T> clazz);
    <T> List<T> qRange(Evn e ,String name, int start, int end, Class<T> clazz);
    <T> List<T> qSlice(Evn e ,String name, int start, int end, Class<T> clazz);
}

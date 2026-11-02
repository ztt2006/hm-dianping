package com.hmdp.utils;

public interface ILock {

    /***
     * 尝试获取锁
     * @param timeoutSec 锁持有的超时时间，过期后自动释放
     * @return true 成功获取锁，false 失败获取锁
     */
    boolean tryLock(long timeoutSec);

    /***
     * 释放锁
     */
    void unlock();
}

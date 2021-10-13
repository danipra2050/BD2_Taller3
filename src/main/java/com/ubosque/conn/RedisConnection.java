package com.ubosque.conn;

import com.ubosque.constant.Constant;
import redis.clients.jedis.Jedis;

public class RedisConnection {

    //Attributes
    private Jedis jedis;

    public RedisConnection(){
        setJedis(new Jedis(Constant.RedisInfo.DB_SERVER, Constant.RedisInfo.DB_PORT));
    }

    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}

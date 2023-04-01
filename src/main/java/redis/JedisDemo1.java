package redis;

import redis.clients.jedis.Jedis;

public class JedisDemo1 {
    public static void main(String[] args) {
        //创建Jedis对象
        Jedis jedis = new Jedis("43.138.59.130", 6379);
        String ping = jedis.ping();
        System.out.println(ping);
    }
}

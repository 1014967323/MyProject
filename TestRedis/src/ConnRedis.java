import redis.clients.jedis.Jedis;

public class ConnRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("120.79.238.232");
        jedis.set("foo", "123");
        String value = jedis.get("foo");
        System.out.println(value);
    }

}

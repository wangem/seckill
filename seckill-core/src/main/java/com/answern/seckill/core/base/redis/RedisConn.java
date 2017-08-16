package com.answern.seckill.core.base.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
  
@Component  
@ConfigurationProperties(prefix = "spring.redis")  //读取springboot的默认配置文件信息中以spring.redis开头的信息
public class RedisConn {  
 
	/**
	 * 最大连接数，如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个JEDIS实例，则此时pool的状态为exhausted(耗尽
	 * )。
	 */
	private Integer maxTotal;

	/**
	 * 控制一个pool最多有多少个状态为idle(空闲的)的JEDIS实例
	 */
	private Integer maxIdle;

	private Integer minIdle;

	/**
	 * 最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；
	 */
	@SuppressWarnings("unused")
	private Integer holed;

	/**
	 * redis服务端口
	 */
	private Integer port;

	/**
	 * redis服务地址
	 */
	private String host;

	/**
	 * redis连接超时时间
	 */
	private Integer timeout;

	/**
	 * redis连接密码
	 */
	private String password;

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private Integer DB;
    
    
	
	public void setHoled(Integer holed)
	{
		this.holed = holed;
	}

	public void setPort(Integer port)
	{
		this.port = port;
	}

	public void setHost(String host)
	{
		this.host = host;
	}
	

	public Integer getPort() {
		return port;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public String getHost() {
		return host;
	}

	public void setTimeout(Integer timeout)
	{
		this.timeout = timeout;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	
	public String getPassword() {
		return password;
	}

	public void setDB(Integer dB)
	{
		DB = dB;
	}

	public Integer getMaxTotal()
	{
		return maxTotal;
	}

	public void setMaxTotal(Integer maxTotal)
	{
		this.maxTotal = maxTotal;
	}

	public Integer getMaxIdle()
	{
		return maxIdle;
	}

	public void setMaxIdle(Integer maxIdle)
	{
		this.maxIdle = maxIdle;
	}

	public Integer getMinIdle()
	{
		return minIdle;
	}

	public void setMinIdle(Integer minIdle)
	{
		this.minIdle = minIdle;
	}

    @Override  
    public String toString() {  
        return "Redis [localhost=" + host + ", port=" + port + ", timeout=" + timeout + "]";  
    }  
      
  
}
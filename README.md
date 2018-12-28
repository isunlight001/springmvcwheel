# springmvc
springmvc小轮子
超级精简版的springmvc
实现功能：
  1 注解controller，service，requestmapping
  2 请求通过浏览器访问，直接返回值
代码思路：
  配置webxml
  继承servelet，重写doget，dopost和init方法
  init方法，
    1 读取webxml文件解析
    2 读取配置文件解析，读取到扫描的包
    3 根据扫描的包把所有的controller和service放到容器中
    4 扫描类，注入字段，处理autowried
    5 处理requestmapping，将uri和method对应
    
   

# Java测试框架 JUnit(JUnit4)
 
 ---
 
 注：测试用例用来达到想要的预期结果，但对于逻辑错误无能为力
 
 ---
 
 - Tips
     1. 测试方法必须使用@Test进行修饰
     2. 测试方法必须使用public void进行修饰，不能带任何参数
     3. 新建一个源代码目录来存放我们的测试代码
     4. 测试类的包应该和被测试类保持一致
     5. 测试单元中的每个方法必须可以独立测试，测试方法间不能有任何依赖
     6. 测试类使用Test作为类的后缀（约定）
     7. 测试方法使用test作为方法的前缀（约定）
     
 ---
  
 - 测试失败的两种情况
     - 和预期结果不一致，结果为失败
     - 代码引发异常，可能由测试代码产生也可能是被测试代码中隐藏的bug，结果为错误
     
 ---
  
 - JUnit运行流程
     - @BeforeClass修饰的方法会在所有的方法被调用前被执行，且为静态，所以当测试类被加载后接着就会运行它，而且在内存中只会存在一份示例，比较适合加载配置文件。
     - @AfterClass修饰的方法通常用来对清理资源，如关闭数据库的连接
     - @Before和@After会在每个测试方法的前后各执行一次
     
 ---
 
 - Junit常用注解
     - @Test：将一个普通的方法修饰为一个测试方法
        - Test(excepted = xx.class) 捕获异常
        - Test(timeout = 毫秒)
     - @BeforeClass：所有方法运行前执行，static修饰  JUnit5为@BeforeAll
     - @AfterClass：所有方法运行后执行，static修饰   JUnir5为@AfterAll
     - @Before：会在每一个测试方法被运行前执行一次    JUnit5为@BeforeEach
     - @After：会在m每一个测试方法被运行后执行一次    JUnit5为@AfterEach
     - @Ignore("...")：所修饰的测试方法会被测试运行忽略
     - @RunWith：可以更改测试运行器
  
 ---
 
 - JUnit测试套件
    - 测试套件就是组织测试类一起运行的
    - 需要一个测试套件的入口类，这个类不包含其他方法
    - 更改测试运行器Suite.class
    - 格式： @RunWith(Suite.class) @Suite.SuiteClasses({test1.class,test2.class,...,testn.class})

---

- 参数化设置
    - 更改默认的测试运行器为RunWith(Parameterized.class)
    - 声明变量来存放预期值和结果值
    - 声明一个返回值 为Collection的公共静态方法，并使用@Parameters进行修饰
    - 为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
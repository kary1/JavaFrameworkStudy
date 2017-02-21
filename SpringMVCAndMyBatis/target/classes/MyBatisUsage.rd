创建Spring-MyBatis项目
1.配置pom.xml文件--添加Mybatis支持
  <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
  <dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.4.1</version>
  </dependency>
2.MyBatis-generator-core 工具添加实体类dao接口和映射文件

3.public class BaseDao {
	private static SqlSessionFactory sf = null;

	private static SqlSessionFactory buildFactory() throws IOException {
		SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
		InputStream is = Resources.getResourceAsStream("MyBatis.xml");
		sf = sfb.build(is);
		return sf;
	}

	synchronized public static SqlSession getSqlSession() {
		if (sf == null) {
			try {
				sf = buildFactory();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sf.openSession();
	}
  }
 4.<configuration>
  <!-- 配置连接数据库的信息 -->
    <environments default="development">
      <environment id="development">
        <transactionManager type="JDBC"></transactionManager>
        <!-- resource="jdbc.properties" -->
        <dataSource type="POOLED">
          <property name="driver" value="com.mysql.jdbc.Driver"/>
          <property name="url" value="jdbc:mysql://localhost:3306/test"/>
          <property name="username" value="root"/>
          <property name="password" value="root"/>
        </dataSource>
      </environment>
    </environments>
  
  <!-- 配置映射文件的信息 -->
    <mappers>
      <mapper resource="com/kary/entitys/StudentMapper.xml"/>
    </mappers>
  </configuration>
5.@Override
	public List<Student> findAll() {
		SqlSession session = BaseDao.getSqlSession();
		List<Student> stus = session.selectList("com.kary.dao.StudentMapper.findAll");
		return stus;
	}
6.@Service("sbiz")
public class StudentBiz {
	@Autowired//自动装配
	private StudentMapper sdao;
	
	public List<Student> findStudent(){
		return sdao.findAll();
	}
}

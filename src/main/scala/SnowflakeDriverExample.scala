  import java.sql.Connection
  import java.sql.DriverManager
  import java.sql.ResultSet
  import java.sql.ResultSetMetaData
  import java.sql.SQLException
  import java.sql.Statement
  import java.util.Properties

  object SnowflakeDriverExample {
    def main(args: Array[String]): Unit = {
      val classpath = System.getProperty("java.class.path")
      System.out.println(classpath)
    }
  }

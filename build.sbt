name := "test_spark_scala"

version := "0.1"

// scalaVersion := "2.13.4"
scalaVersion := "2.12.10"

//spark-packages

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.1"

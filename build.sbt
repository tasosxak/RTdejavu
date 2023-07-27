name := "dejavu"

version := "0.1"

scalaVersion := "2.11.1"


// Define the assemblyMergeStrategy to include the Monitor.txt file
assemblyMergeStrategy in assembly := {
  case "src/main/scala/Monitor.txt" => MergeStrategy.rename
  case x => (assemblyMergeStrategy in assembly).value(x)
}

// Define the assemblyJarName to set the desired name for the JAR file
assemblyJarName in assembly := "dejavu.jar"

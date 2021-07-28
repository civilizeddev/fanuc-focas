organization       := "io.elfinos"
name               := "fanuc-focas"
scalaVersion       := "2.13.6"
crossScalaVersions := Seq("2.12.14", "2.13.6")
releaseCrossBuild  := true
githubOwner        := "civilizeddev"
githubRepository   := name.value

libraryDependencies ++= Seq(
  "net.java.dev.jna" % "jna-platform"  % "5.8.0",
  "org.scala-lang"   % "scala-reflect" % scalaVersion.value % Provided,
  "org.scalameta"   %% "munit"         % "0.7.27"           % Test,
)

scalafixOnCompile := true
semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x =>
    val oldStrategy = (assembly / assemblyMergeStrategy).value
    oldStrategy(x)
}

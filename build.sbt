name         := "fanuc-focas"
version      := "1.0.0"
scalaVersion := "2.13.6"

val jnaVersion   = "5.8.0"
val munitVersion = "0.7.27"

libraryDependencies ++= Seq(
  "net.java.dev.jna" % "jna-platform"  % jnaVersion,
  "org.scala-lang"   % "scala-reflect" % scalaVersion.value % Provided,
  "org.scalameta"   %% "munit"         % munitVersion       % Test,
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

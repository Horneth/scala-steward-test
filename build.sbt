name := "scala-steward-test"

lazy val root = Project("scala-steward-test", file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "io.scalaland" %% "chimney" % "0.6.1",
    )
  )

lazy val Http4sVersion     = "0.18.21"
lazy val CirceVersion      = "0.10.1"
lazy val LogbackVersion    = "1.2.3"
lazy val ScalaTestVersion  = "3.0.3"
lazy val ScalaCheckVersion = "1.13.4"
lazy val Log4CatsVersion   = "0.1.1"

lazy val root = (project in file("."))
  .settings(
    name := "vigilant-fiesta",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.4",
    scalacOptions := Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-Ypartial-unification",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-value-discard"
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.6"),
    libraryDependencies ++= Seq(

      "org.http4s"        %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s"        %% "http4s-circe"        % Http4sVersion,
      "org.http4s"        %% "http4s-dsl"          % Http4sVersion,
      "io.circe"          %% "circe-core"          % CirceVersion,
      "io.circe"          %% "circe-generic"       % CirceVersion,
      "io.circe"          %% "circe-parser"        % CirceVersion,

      "ch.qos.logback"    %  "logback-classic"     % LogbackVersion,
      "io.chrisdavenport" %% "log4cats-slf4j"      % Log4CatsVersion,

      "org.scalatest"     %% "scalatest"           % ScalaTestVersion  % Test,
      "org.scalacheck"    %% "scalacheck"          % ScalaCheckVersion % Test
    )
  )


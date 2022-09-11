lazy val ScalaVersion      = "2.13.8"
lazy val Http4sVersion     = "0.23.12"
lazy val CirceVersion      = "0.14.1"
lazy val ScalaTestVersion  = "3.2.13"
lazy val ScalaCheckVersion = "1.14.1"

lazy val root = (project in file("."))
  .settings(
    name := "vigilant-fiesta",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := ScalaVersion,
    scalacOptions := Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-value-discard"
    ),
    addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full),
    libraryDependencies ++= Seq(

      "org.http4s"        %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s"        %% "http4s-circe"        % Http4sVersion,
      "org.http4s"        %% "http4s-dsl"          % Http4sVersion,
      "io.circe"          %% "circe-core"          % CirceVersion,
      "io.circe"          %% "circe-generic"       % CirceVersion,
      "io.circe"          %% "circe-parser"        % CirceVersion,

      // "ch.qos.logback"    %  "logback-classic"     % LogbackVersion,
      // "io.chrisdavenport" %% "log4cats-slf4j"      % Log4CatsVersion,

      "org.scalatest"     %% "scalatest"           % ScalaTestVersion  % Test,
      "org.scalacheck"    %% "scalacheck"          % ScalaCheckVersion % Test,
      "org.scalatestplus" %% "scalacheck-1-16"     % "3.2.13.0" % Test
    )
  )


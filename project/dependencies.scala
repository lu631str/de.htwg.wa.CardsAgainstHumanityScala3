import sbt._

object dependencies {
  val scalactic = "org.scalactic" %% "scalactic" % versionNumber.scalactic
  val scalatest = "org.scalatest" %% "scalatest" % versionNumber.scalatest % "test"
  val scalalangmodulesXml = "org.scala-lang.modules" %% "scala-xml" % versionNumber.scalalangmodulesXml
  val scalalangmodulesSwing = "org.scala-lang.modules" % "scala-swing_2.13" % versionNumber.scalalangmodulesSwing
  val googleinject = "com.google.inject" % "guice"% versionNumber.googleinject
  val typesafeplay = "com.typesafe.play" %% "play-json" % versionNumber.typesafeplay
  val akkaActorTyped = ("com.typesafe.akka" %% "akka-actor-typed" % versionNumber.akkaVersion).cross(CrossVersion.for3Use2_13)
  val akkaStream = ("com.typesafe.akka" %% "akka-stream" % versionNumber.akkaVersion).cross(CrossVersion.for3Use2_13)
  val akkaActor = ("com.typesafe.akka" %% "akka-actor" % versionNumber.akkaVersion).cross(CrossVersion.for3Use2_13)
  val akkaHttp = ("com.typesafe.akka" %% "akka-http" % versionNumber.akkaHttpVersion).cross(CrossVersion.for3Use2_13)
  val slf4jNop = "org.slf4j" % "slf4j-nop" % versionNumber.slf4jNop
}

object versionNumber {
  val scalactic = "3.2.11"
  val scalatest = "3.2.11"
  val googleinject = "5.1.0"
  val scalalangmodulesXml = "2.0.1"
  val scalalangmodulesSwing = "3.0.0"
  val typesafeplay = "2.10.0-RC5"
  val akkaVersion = "2.6.18"
  val akkaHttpVersion = "10.2.9"
  val slf4jNop = "2.0.0-alpha7"
}
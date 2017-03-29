name := "derivation-reproducers"
organization := "netia.pl"
scalaVersion := "2.12.1"

val circeVesion = "0.7.0"
val doobieVersion = "0.4.0"

libraryDependencies ++= Seq(
    "io.circe" %% "circe-generic" % circeVesion,
    "org.tpolecat" %% "doobie-core-cats"  % doobieVersion
)

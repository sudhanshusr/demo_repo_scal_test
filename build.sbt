
//Organization
organization := "com.cybage.hellosbt"

//Version of your project
version := "0.1.0"

//Scala version
scalaVersion := "2.11.6"

//Name of Project
name := "Scala_test_plugin_created"



jacoco.settings

coverageEnabled := true

coverageMinimum := 10

coverageFailOnMinimum := true

coverageExcludedPackages := "<empty>;Reverse.*;.*AuthService.*;models\\.data\\..*"

//import de.johoop.findbugs4sbt.FindBugs._

findbugsSettings

findbugsReportType := Some(de.johoop.findbugs4sbt.ReportType.Html)


//import de.johoop.cpd4sbt.CopyPasteDetector._

//cpdSettings

val myProject = (project in file(".")).enablePlugins(CpdPlugin)


libraryDependencies ++= 
			Seq("junit" % "junit" % "4.10",
			"com.novocode" % "junit-interface" % "0.11" % Test,
				"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
				"com.sksamuel.scapegoat" % "scalac-scapegoat-plugin_2.11" % "0.3.0"
				)
				
			
addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat" % "1.0.0")			
			
import de.johoop.findbugs4sbt.FindBugs._

findbugsSettings
    		

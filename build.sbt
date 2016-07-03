/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "spark-s3"

version := "0.0.0"

organization := "io.entilzha"

organizationName := "Pedro Rodriguez"

organizationHomepage := Some(url("https://github.com/EntilZha"))

licenses += "Apache V2" -> url("https://raw.githubusercontent.com/EntilZha/spark-s3/master/LICENSE")

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.6.1" % "provided",
  "com.amazonaws" % "aws-java-sdk" % "1.7.4",
  "org.apache.commons" % "commons-compress" % "1.4.1",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

ghpages.settings

git.remoteRepo := "git@github.com:EntilZha/spark-s3.git"

site.includeScaladoc()

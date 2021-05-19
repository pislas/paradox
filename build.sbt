name := "Pioneer"

version := "0.1"

scalaVersion := "2.13.0"

paradoxNavigationDepth := 2

paradoxNavigationIncludeHeaders := false

paradoxProperties in Compile ++= Map("image.base_url" -> ".../assets/images")

lazy val root = (project in file("."))
  .enablePlugins(ParadoxPlugin)
  .settings(
    name := "Hello Project",
    paradoxTheme := Some(builtinParadoxTheme("generic")),
  )


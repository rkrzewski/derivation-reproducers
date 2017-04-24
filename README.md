# derivation-reproducers

Generate Eclipse project descriptors using sbt-eclipse and import into Scala IDE 4.6.0.RC1

You should see phantom errors reported by presentation compiler in `example.Data`

What's interesting they seem to appear and dissappear randomly when editing whitespace in the file, or simply switching back and forth between editor tabs.

# solved!

Adding `-Ymacro-expand:normal` to "Additional commans line parameters" of Scala compiler in the IDE fixes the problem. See [SI-9716](https://github.com/scala/bug/issues/9716) for details

@file:Suppress("unused", "DuplicatedCode")

// DO NOT EDIT MANUALLY!
// Generated by generators/tests/org/jetbrains/kotlin/generators/arguments/GenerateCompilerArgumentsCopy.kt
// To regenerate run 'generateCompilerArgumentsCopy' task

package org.jetbrains.kotlin.config

@OptIn(org.jetbrains.kotlin.utils.IDEAPluginsCompatibilityAPI::class)
fun copyJpsPluginSettings(from: JpsPluginSettings, to: JpsPluginSettings): JpsPluginSettings {
    to.externalSystemId = from.externalSystemId
    to.version = from.version

    return to
}

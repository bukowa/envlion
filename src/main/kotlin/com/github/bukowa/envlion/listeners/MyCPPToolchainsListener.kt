package com.github.bukowa.envlion.listeners

import com.intellij.openapi.project.Project
import com.jetbrains.cidr.cpp.cmake.CMakeRunner
import com.jetbrains.cidr.cpp.cmake.CMakeRunnerStep
import com.jetbrains.cidr.cpp.cmake.CMakeSettings
import com.jetbrains.cidr.cpp.cmake.CMakeSettingsListener
import com.jetbrains.cidr.cpp.cmake.workspace.CMakeWorkspaceListener
import com.jetbrains.cidr.cpp.toolchains.*
import com.jetbrains.cidr.execution.build.CidrBuildEvent
import com.jetbrains.cidr.execution.build.CidrBuildListener
import com.jetbrains.cidr.execution.build.CidrBuildResult
import java.io.File
import java.nio.file.Path

internal class MyCPPToolchainsListener : CPPToolchainsListener {
    override fun toolchainCMakeEnvironmentChanged(toolchains: Set<CPPToolchains.Toolchain?>) {
        super.toolchainCMakeEnvironmentChanged(toolchains)
    }

    override fun toolchainsRenamed(renamed: Map<String?, String?>) {
        super.toolchainsRenamed(renamed)
    }

}


internal class MyDevEnvironmentChecker : DevEnvironmentChecker {
    override fun checkDevEnvironment(p0: CPPEnvironment?): DevEnvironment {
        TODO("Not yet implemented")
    }


}
class MyCMakeRunnerStep: CMakeRunnerStep {
    override fun beforeGeneration(
        p0: Project,
        p1: CMakeRunnerStep.Parameters
    ) {
        TODO("Not yet implemented")
    }

    override fun modifyParameters(
        project: Project,
        parameters: CMakeRunnerStep.Parameters
    ): CMakeRunnerStep.Parameters {
        return super.modifyParameters(project, parameters)
    }

}

internal class MyCidrBuildListener public constructor(project: Project?) : CidrBuildListener {
    private val myProject: Project? = project

    override fun beforeStarted(buildEvent: CidrBuildEvent) {
        super.beforeStarted(buildEvent)
    }

    override fun afterFinished(
        buildEvent: CidrBuildEvent,
        result: CidrBuildResult
    ) {
        super.afterFinished(buildEvent, result)
    }
}


internal class MyCMakeSettingsListener: CMakeSettingsListener {
    override fun profilesChanged(
        old: List<CMakeSettings.Profile>,
        current: List<CMakeSettings.Profile>
    ) {
        super.profilesChanged(old, current)
    }

    override fun autoReloadChanged() {
        super.autoReloadChanged()
    }
}

internal class MyCMakeWorkspaceListener public constructor(project: Project) : CMakeWorkspaceListener {
    private val myProject: Project = project

    override fun reloadingStarted() {
        super.reloadingStarted()
    }

    override fun filesRefreshedAfterGeneration() {
        super.filesRefreshedAfterGeneration()
    }

    override fun generationFinished() {
        super.generationFinished()
    }

    override fun generationStarted() {
        super.generationStarted()
    }

    override fun reloadingScheduled() {
        super.reloadingScheduled()
    }

    override fun generationCMakeExited(output: CMakeRunner.CMakeOutput) {
        super.generationCMakeExited(output)
    }

    override fun generationDirCleared(generationDir: Path) {
        super.generationDirCleared(generationDir)
    }

    override fun reloadingFinished(canceled: Boolean) {
        super.reloadingFinished(canceled)
    }

    override fun afterApplyingNoLocks() {
        super.afterApplyingNoLocks()
    }

    override fun filesWillBeRefreshedAfterGeneration(files: List<File?>) {
        super.filesWillBeRefreshedAfterGeneration(files)
    }

    override fun beforeApplying() {
        super.beforeApplying()
    }

    override fun reloadingRescheduled() {
        super.reloadingRescheduled()
    }

}


/*
* Copyright 2016 John Ahlroos
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package fi.jasoft.plugin.configuration

import fi.jasoft.plugin.MessageLogger
import org.gradle.api.Project

/**
 * Configuration options for the GWT compiler
 */
@PluginConfiguration
@Deprecated
class GWTConfiguration {

    @Deprecated
    transient Project project

    @Deprecated
    GWTConfiguration(Project project){
        this.project = project
    }
    /**
     * Compilation style
     */
    @Deprecated
    void style(String style){
        project.vaadinCompile.configuration.style = style
        getStyle()
    }
    @Deprecated
    void setStyle(String style){
        project.vaadinCompile.configuration.style = style
        getStyle()
    }
    @Deprecated
    String getStyle(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.style',
                'This property has been replaced by vaadinCompile.configuration.style.')
        project.vaadinCompile.configuration.style
    }

    /**
     * Should the compilation result be optimized
     */
    @Deprecated
    void optimize(Integer optimize){
        project.vaadinCompile.configuration.optimize = optimize
        getOptimize()
    }
    @Deprecated
    void setOptimize(Integer optimize){
        project.vaadinCompile.configuration.optimize = optimize
        getOptimize()
    }
    @Deprecated
    Integer getOptimize(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.optimize',
                'This property has been replaced by vaadinCompile.configuration.optimize.')
        project.vaadinCompile.configuration.optimize
    }

    /**
     * Should logging be enabled
     */
    @Deprecated
    void logging(Boolean logging){
        project.vaadinCompile.configuration.logging = logging
        isLogging()
    }
    @Deprecated
    void setLogging(Boolean logging){
        project.vaadinCompile.configuration.logging = logging
        isLogging()
    }
    @Deprecated
    Boolean isLogging(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.logging',
                'This property has been replaced by vaadinCompile.configuration.logging.')
        project.vaadinCompile.configuration.logging
    }

    /**
     * The log level. Possible levels NONE,DEBUG,TRACE,INFO
     */
    @Deprecated
    void logLevel(String logLevel){
        project.vaadinCompile.configuration.logLevel = logLevel
        getLogLevel()
    }
    @Deprecated
    void setLogLevel(String logLevel){
        project.vaadinCompile.configuration.logLevel = logLevel
        getLogLevel()
    }
    @Deprecated
    String getLogLevel(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.logLevel',
                'This property has been replaced by vaadinCompile.configuration.logLevel.')
        project.vaadinCompile.configuration.logLevel
    }

    /**
     * Amount of local workers used when compiling. By default the amount of processors.
     */
    @Deprecated
    void localWorkers(Integer localWorkers){
        project.vaadinCompile.configuration.localWorkers = localWorkers
        getLocalWorkers()
    }
    @Deprecated
    void setLocalWorkers(Integer localWorkers){
        project.vaadinCompile.configuration.localWorkers = localWorkers
        getLocalWorkers()
    }
    @Deprecated
    Integer getLocalWorkers(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.localWorkers',
                'This property has been replaced by vaadinCompile.configuration.localWorkers.')
        project.vaadinCompile.configuration.localWorkers
    }

    /**
     * Should draft compile be used
     */
    @Deprecated
    void draftCompile(Boolean draftCompile){
        project.vaadinCompile.configuration.draftCompile = draftCompile
        isDraftCompile()
    }
    @Deprecated
    void setDraftCompile(Boolean draftCompile){
        project.vaadinCompile.configuration.draftCompile = draftCompile
        isDraftCompile()
    }
    @Deprecated
    Boolean isDraftCompile(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.draftCompile',
                'This property has been replaced by vaadinCompile.configuration.draftCompile.')
        project.vaadinCompile.configuration.draftCompile
    }

    /**
     * Should strict compiling be used
     */
    @Deprecated
    void strict(Boolean strict){
        project.vaadinCompile.configuration.strict = strict
        isStrict()
    }
    @Deprecated
    void setStrict(Boolean strict){
        project.vaadinCompile.configuration.strict = strict
        isStrict()
    }
    @Deprecated
    Boolean isStrict(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.strict',
                'This property has been replaced by vaadinCompile.configuration.strict.')
        project.vaadinCompile.configuration.strict
    }

    /**
     * What user agents (browsers should be used. By defining null all user agents are used.
     */
    @Deprecated
    void userAgent(String userAgent){
        project.vaadinCompile.configuration.userAgent = userAgent
        getUserAgent()
    }
    @Deprecated
    void setUserAgent(String userAgent){
        project.vaadinCompile.configuration.userAgent = userAgent
        getUserAgent()
    }
    @Deprecated
    String getUserAgent(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.userAgent',
                'This property has been replaced by vaadinCompile.configuration.userAgent.')
        project.vaadinCompile.configuration.userAgent
    }

    /**
     * Extra jvm arguments passed the JVM running the compiler
     */
    @Deprecated
    void jvmArgs(String[] jvmArgs){
        project.vaadinCompile.configuration.jvmArgs = jvmArgs
        getJvmArgs()
    }
    @Deprecated
    void setJvmArgs(String[] jvmArgs){
        project.vaadinCompile.configuration.jvmArgs = jvmArgs
        getJvmArgs()
    }
    @Deprecated
    String[] getJvmArgs(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.jvmArgs',
                'This property has been replaced by vaadinCompile.configuration.jvmArgs.')
        project.vaadinCompile.configuration.jvmArgs
    }

    /**
     * Extra arguments passed to the compiler
     */
    @Deprecated
    void extraArgs(String[] extraArgs){
        project.vaadinCompile.configuration.extraArgs = extraArgs
        getExtraArgs()
    }
    @Deprecated
    void setExtraArgs(String[] extraArgs){
        project.vaadinCompile.configuration.extraArgs = extraArgs
        getExtraArgs()
    }
    @Deprecated
    String[] getExtraArgs(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.extraArgs',
                'This property has been replaced by vaadinCompile.configuration.extraArgs.')
        project.vaadinCompile.configuration.extraArgs
    }

    /**
     * Source paths where the compiler will look for source files
     */
    @Deprecated
    void sourcePaths(String[] sourcePaths){
        project.vaadinCompile.configuration.sourcePaths = sourcePaths
        getSourcePaths()
    }
    @Deprecated
    void setSourcePaths(String[] sourcePaths){
        project.vaadinCompile.configuration.sourcePaths = sourcePaths
        getSourcePaths()
    }
    @Deprecated
    String[] getSourcePaths(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.sourcePaths',
                'This property has been replaced by vaadinCompile.configuration.sourcePaths.')
        project.vaadinCompile.configuration.sourcePaths
    }

    /**
     * Should the compiler permutations be collapsed to save time
     */
    @Deprecated
    void collapsePermutations(Boolean collapsePermutations){
        project.vaadinCompile.configuration.collapsePermutations = collapsePermutations
        isCollapsePermutations()
    }
    @Deprecated
    void setCollapsePermutations(Boolean collapsePermutations){
        project.vaadinCompile.configuration.collapsePermutations = collapsePermutations
        isCollapsePermutations()
    }
    @Deprecated
    Boolean isCollapsePermutations(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.collapsePermutations',
                'This property has been replaced by vaadinCompile.configuration.collapsePermutations.')
        project.vaadinCompile.configuration.collapsePermutations
    }

    /**
     * Extra module inherits
     */
    @Deprecated
    void extraInherits(String[] extraInherits){
        project.vaadinCompile.configuration.extraInherits = extraInherits
        getExtraInherits()
    }
    @Deprecated
    void setExtraInherits(String[] extraInherits){
        project.vaadinCompile.configuration.extraInherits = extraInherits
        getExtraInherits()
    }
    @Deprecated
    String[] getExtraInherits(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.extraInherits',
                'This property has been replaced by vaadinCompile.configuration.extraInherits.')
        project.vaadinCompile.configuration.extraInherits
    }

    /**
     * Should GWT be placed first in the classpath when compiling the widgetset.
     */
    @Deprecated
    void gwtSdkFirstInClasspath(Boolean gwtSdkFirstInClasspath){
        project.vaadinCompile.configuration.gwtSdkFirstInClasspath = gwtSdkFirstInClasspath
        isGwtSdkFirstInClasspath()
    }
    @Deprecated
    void setGwtSdkFirstInClasspath(Boolean gwtSdkFirstInClasspath){
        project.vaadinCompile.configuration.gwtSdkFirstInClasspath = gwtSdkFirstInClasspath
        isGwtSdkFirstInClasspath()
    }
    @Deprecated
    Boolean isGwtSdkFirstInClasspath(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.gwtSdkFirstInClasspath',
                'This property has been replaced by vaadinCompile.configuration.gwtSdkFirstInClasspath.')
        project.vaadinCompile.configuration.gwtSdkFirstInClasspath
    }

    /**
     * (Optional) root directory, for generated files; default is the web-app dir from the WAR plugin
     */
    @Deprecated
    void outputDirectory(File outputDirectory){
        project.vaadinCompile.configuration.outputDirectory = outputDirectory.canonicalPath
        getOutputDirectory()
    }
    @Deprecated
    void setOutputDirectory(File outputDirectory){
        project.vaadinCompile.configuration.outputDirectory = outputDirectory.canonicalPath
        getOutputDirectory()
    }
    @Deprecated
    void setOutputDirectory(String directory){
        project.vaadinCompile.configuration.outputDirectory = directory
        getOutputDirectory()
    }
    @Deprecated
    File getOutputDirectory(){
        MessageLogger.nagUserOfDiscontinuedProperty('vaadin.gwt.outputDirectory',
                'This property has been replaced by vaadinCompile.configuration.outputDirectory.')
        project.vaadinCompile.configuration.outputDirectory as File
    }


}

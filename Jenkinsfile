#!/usr/bin/env groovy

node {
	
    checkout scm

    stage('Test') {
        sh './gradlew check || true'
    }

    stage('Build') {
        sh './gradlew clean build'
        archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
    }

    stage('Deploy') {
        if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
            //sh 'make publish'
        }
    }
}
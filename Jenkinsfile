#!/usr/bin/env groovy

node {
	
    properties([
        pipelineTriggers([
            [$class: 'GenericTrigger',
                genericVariables: [
                    [expressionType: 'JSONPath', key: 'reference', value: '$.ref'],
                    [expressionType: 'JSONPath', key: 'before', value: '$.before'],
                    [expressionType: 'JSONPath', key: 'after', value: '$.after'],
                    [expressionType: 'JSONPath', key: 'repository', value: '$.repository.full_name']
                ],
                genericRequestVariables: [
                    [key: 'requestWithNumber', regexpFilter: '[^0-9]'],
                    [key: 'requestWithString', regexpFilter: '']
                ],
                genericHeaderVariables: [
                    [key: 'headerWithNumber', regexpFilter: '[^0-9]'],
                    [key: 'headerWithString', regexpFilter: '']
                ],
                regexpFilterText: '$repository/$reference',
                regexpFilterExpression: 'GMS/vol/refs/heads/master'  // Git에 있는 조직그룹/저장소명 (GMS/vol)
            ]
        ])
    ])

    stage('Info') {
        echo "Repository : ${repository}/${reference}"
		echo "${after} => ${before}"
    }
    	
    checkout scm

    stage('Test') {
        sh './gradlew check || true'
    }

    stage('Deploy check') {
        mail (to: 'mjskyroom@sicc.co.kr',
            subject: "Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) is waiting for input",
            body: "Please go to ${env.BUILD_URL}.");
        input "운영 환경으로 배포하시겠습니까?"
    }    
    
    stage('Deploy') {
        if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
            sh 'true'
        }
    }    
}
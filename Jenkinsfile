node {
	def app
	
	stage('clone repository'){
		checkout scm
	}
	
	stage('Build image'){
		app = docker.build("build/test")
	}
}
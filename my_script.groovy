def buildApp(){
	echo 'building the application...'
}

def testApp(){
	echo 'testing the application...'
}

def deployApp(){
	echo 'deploy the application...'	
	echo "deploy version ${params.VERSION}"
}

return this

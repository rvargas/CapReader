modules = {
    application {
		defaultBundle "main-v${new Date().format('ddMMyyyy')}"
		
		dependsOn 'bootstrap'
		
        resource url:'js/application.js'
		resource url:'css/application.css'
    }
	bootstrap {
		defaultBundle "bootstrap-v${new Date().format('ddMMyyyy')}"
		
		dependsOn 'jquery'
		
		resource url:'css/bootstrap.min.css'
		resource url:'js/bootstrap.min.js'
	}
	map{
		defaultBundle "map-v${new Date().format('ddMMyyyy')}"
		
		resource url:'css/map.css'
		resource url:'js/map.js', disposition: 'head'
	}
}
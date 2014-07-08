package me.rafaelvargas.captest

import com.google.publicalerts.cap.profile.CapProfile
import com.google.publicalerts.cap.validator.CapValidator
import com.google.publicalerts.cap.validator.MapVisualizer
import com.google.publicalerts.cap.validator.ValidationResult
import groovy.util.slurpersupport.GPathResult
import org.json.JSONArray

class CapController {

    def index() {
		if(!params.src)	return
		
		CapFeed capFeed = CapFeed.read(params.src)
		
		if(!capFeed)	return
		
		GPathResult records = new XmlSlurper().parse(capFeed.url)
		
		CapValidator capValidator = new CapValidator()
		ValidationResult validateCap = capValidator.validate(capFeed.url,[] as Set<CapProfile>)
		JSONArray mapCaps = new MapVisualizer(validateCap.validAlerts).getAlertsJs()
		
		[records:records,mapCaps:mapCaps]
	}
}

import me.rafaelvargas.captest.CapFeed

class BootStrap {

    def init = { servletContext ->
		if(!CapFeed.count()){
			def capFeed = new CapFeed(name:'Conagua', url:'https://correo1.conagua.gob.mx/feedsmn/feedalert.aspx').save(flush:true)
			capFeed = new CapFeed(name:'National Weather Service (Florida)', url:'http://alerts.weather.gov/cap/fl.php?x=0').save(flush:true)
			capFeed = new CapFeed(name:'National Weather Service (California)', url:'http://alerts.weather.gov/cap/ca.php?x=0').save(flush:true)
			capFeed = new CapFeed(name:'National Air Quality CAP Alerts', url:'http://feeds.enviroflash.info/cap/aggregate.xml').save(flush:true)
			
			assert CapFeed.count() == 4
		}
    }
    def destroy = {
    }
}

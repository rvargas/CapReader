dataSource {
    pooled = true
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    driverClassName = "com.mysql.jdbc.Driver"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            username = ""
			password = ""
			
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_capreader?autoReconnect=true&zeroDateTimeBehavior=convertToNull"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            username = ""
			password = ""
			
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_capreader?autoReconnect=true&zeroDateTimeBehavior=convertToNull"
			
			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1"
			 }
        }
    }
}

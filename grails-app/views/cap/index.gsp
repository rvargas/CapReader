<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<r:require module="map"/>
		<g:if test="${mapCaps}">
			<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?key=AIzaSyBA1HOBDVvUJy0Dmbqhy33Q42KnYPJPqZk&sensor=FALSE"></script>
			<script>
				var alerts = ${mapCaps};
			</script>
		</g:if>
	</head>
	<body class="home">
		<h2>Lectura de CAP</h2>
		<div >
			<g:form controller="cap" action="index" method="get" class="form-inline">
				<div class="form-group">
					<g:select name="src" from="${ me.rafaelvargas.captest.CapFeed.list() }" optionKey="id" optionValue="name" value="${params.src}" class="form-control"/>
				</div>
				<div class="form-group">
					<button type="Submit" class="btn btn-primary btn-small">Ver</button>
				</div>
			</g:form>
		</div>
		<hr>
		<g:if test="${mapCaps}">
			<div class="container">
				<div class="row">
					<div id="map" class="col-md-8 col-md-offset-2"></div>
				</div>
			</div>
			<hr>
		</g:if>
		<g:if test="${records}">
			<p><strong>Título</strong>: ${records.title}</p>
			<p><strong>Derechos</strong>: ${records.rights}</p>
			<p><strong>Actualización</strong>: ${records.updated}</p>
			<p><strong>Alertas</Strong>: ${records.entry.size()}</p>
			
			<div class="table-responsive">
				<table class="table table-bordered table-hover table-striped">
					<thead>
						<tr>
							<th></th>
							<th>Título</th>
							<th>Actualización</th>
						</tr>
					</thead>
					<tbody>
						<g:each in="${records.entry}" status="i" var="entry">
							<tr>
								<td>${i+1}</td>
								<td>${entry.title}</td>
								<td>${entry.updated}</td>
							</tr>
						</g:each>
					</tbody>
				</table>
			</div>
		</g:if>
	</body>
</html>

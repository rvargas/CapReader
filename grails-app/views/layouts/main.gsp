<!DOCTYPE html>
<html lang="es">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="CapReader de Vinco Orbis">
		<meta name="author" content="rv@manoderecha.mx">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}">
		
		<r:require modules="application"/>
		
		<title>CapReader <g:layoutTitle default=""/></title>
		
		<g:layoutHead/>
		<r:layoutResources />

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
			<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="${pageProperty(name:'body.class')}">
		<div class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="${createLink(uri:'/') }">Captest</a>
				</div>
			</div>
		</div>

		<div class="container">
			<g:layoutBody/>
		</div>

		<div id="footer">
			<div class="container">
				<p class="text-muted">CapReader 2014</p>
			</div>
		</div>

		<r:layoutResources />
	</body>
</html>

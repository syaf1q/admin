<head>
<title>Admin Panel</title>

<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="${css}/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<!-- Custom Theme files -->
<link href="${css}/style.css" rel="stylesheet" type="text/css"
	media="all" />
<!--js-->
<script src="${js}/jquery-2.1.1.min.js"></script>
<!--icons-css-->
<link href="${css}/font-awesome.css" rel="stylesheet">
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'
	rel='stylesheet' type='text/css'>
<!--static chart-->
<script src="${js}/Chart.min.js"></script>
<!--//charts-->
<!-- geo chart -->
<script src="//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js"
	type="text/javascript"></script>
<script>
	window.modernizr
			|| document
					.write('<script src="lib/modernizr/modernizr-custom.js"><\/script>')
</script>

<!-- Chartinator  -->
<script src="${js}/chartinator.js"></script>
<script type="text/javascript">
	jQuery(function($) {

		var chart3 = $('#geoChart').chartinator(
				{
					tableSel : '.geoChart',

					columns : [ {
						role : 'tooltip',
						type : 'string'
					} ],

					colIndexes : [ 2 ],

					rows : [ [ 'China - 2015' ], [ 'Colombia - 2015' ],
							[ 'France - 2015' ], [ 'Italy - 2015' ],
							[ 'Japan - 2015' ], [ 'Kazakhstan - 2015' ],
							[ 'Mexico - 2015' ], [ 'Poland - 2015' ],
							[ 'Russia - 2015' ], [ 'Spain - 2015' ],
							[ 'Tanzania - 2015' ], [ 'Turkey - 2015' ] ],

					ignoreCol : [ 2 ],

					chartType : 'GeoChart',

					chartAspectRatio : 1.5,

					chartZoom : 1.75,

					chartOffset : [ -12, 0 ],

					chartOptions : {

						width : null,

						backgroundColor : '#fff',

						datalessRegionColor : '#F5F5F5',

						region : 'world',

						resolution : 'countries',

						legend : 'none',

						colorAxis : {

							colors : [ '#679CCA', '#337AB7' ]
						},
						tooltip : {

							trigger : 'focus',

							isHtml : true
						}
					}

				});
	});
</script>
<!--geo chart-->

<!--skycons-icons-->
<script src="${js}/skycons.js"></script>
<!--//skycons-icons-->
</head>
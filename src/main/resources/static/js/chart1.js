$.getJSON(
    '/medicaid/year',
    function (data) {

        Highcharts.chart('container1', {
            chart: {
                zoomType: 'x'
            },
            title: {
                text: '$ spent for drugs reimbursement by Medicaid.gov '
            },
            subtitle: {
                text: document.ontouchstart === undefined ?
                    'Click and drag in the plot area to zoom in' : 'Pinch the chart to zoom in'
            },
            xAxis: {
                type: 'category',
                title: {
                    enabled: true,
                    text: 'Year'
                }
            },
            yAxis: {
                title: {
                    text: 'USD'
                },
                min: 0
            },
            legend: {
                enabled: false
            },
            plotOptions: {
                area: {
                    fillColor: {
                        linearGradient: {
                            x1: 0,
                            y1: 0,
                            x2: 0,
                            y2: 1
                        },
                        stops: [
                            [0, Highcharts.getOptions().colors[0]],
                            [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                        ]
                    },
                    marker: {
                        radius: 2
                    },
                    lineWidth: 1,
                    states: {
                        hover: {
                            lineWidth: 1
                        }
                    },
                    threshold: null
                }
            },

            series: [{
                // type: 'area',
                type: 'column',
                name: 'USD to EUR',
                data: data
            }]
        });
    }
);
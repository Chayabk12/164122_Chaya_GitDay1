var http = require('http');
var fs = require('fs');

http.createServer(function (req, res) {
  fs.readFile('Helllo.html', function(err, data) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    
  });
}).listen(3000);
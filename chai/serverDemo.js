var express = require('express');
var app = express();
var bodyParser= require('body-parser');
var urlencoderParser= bodyParser.urlencoded({extended:false})

app.use(express.static('public')); 
app.get('/sne.html', function (req, res) {
   res.sendFile( __dirname + "/" + "sne.html" );
})

app.get('/process_get',urlencoderParser, function (req, res) {
   // Prepare output in JSON format
   response = {
      username:req.query.Username=="Sneha",
      Password:req.query.password=="Kashyap"
   };
   console.log(response);
   res.end(JSON.stringify(response));
})

var server = app.listen(3053, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
});
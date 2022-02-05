const express = require("express");
const ejs = require("ejs");
const app = express();
const mongoose = require("mongoose");

//CONNECT DB 
mongoose.connect('mongodb://localhost/pcat-test-db',{
  useNewUrlParser: true,
  useUnifiedTopology: true
});

//TEMPLATE ENGINE
app.set('view engine', 'ejs');

//MIDDLEWARES
app.use(express.static('public'));
app.use(express.urlencoded({extended:true}));
app.use(express.json());


app.get("/", (req, res) => {
  res.render('index');
});

app.get("/add_post", (req, res) => {
  res.render('add_post');
});

app.get("/about", (req, res) => {
  res.render('about');
});

app.post('/photos', (req, res)=>{
  console.log(req.body);
  res.redirect('index');
});


const port = 3000;
app.listen(port, ()=>{
    console.log(`Server ${port} portunda başlatıldı.`)
})

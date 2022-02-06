const express = require("express");
const ejs = require("ejs");
const app = express();
const mongoose = require("mongoose");
const Photo = require('./models/Photo');

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

app.get('/' , async (req, res) =>{
  const photos = await Photo.find({});
  res.render('index', {
    photos
  })
});
app.get("/", (req, res) => {
  res.render('index');
});

app.get("/add_post", (req, res) => {
  res.render('add_post');
});

app.get("/about", (req, res) => {
  res.render('about');
});
app.get("/post/:id", async (req, res)=>{
  const photo = await Photo.findById(req.params.id);
  res.render('post', {
    photo
  });
});

app.post('/post', async (req, res)=>{
  await Photo.create(req.body);
  console.log(req.body);
  res.redirect('/');
});



const port = 3000;
app.listen(port, ()=>{
    console.log(`Server ${port} portunda başlatıldı.`)
})

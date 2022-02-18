const express = require("express");
const ejs = require("ejs");
const app = express();
const mongoose = require("mongoose");
const methodOverride = require('method-override');
const postControllers = require('./controllers/postControllers');
const pageController = require('./controllers/pageController');

//CONNECT DB 
mongoose.connect('mongodb://localhost/pcat-test-db',{
  useNewUrlParser: true,
  useUnifiedTopology: true,
  
});

//TEMPLATE ENGINE
app.set('view engine', 'ejs');

//MIDDLEWARES
app.use(express.static('public'));
app.use(express.urlencoded({extended:true}));
app.use(express.json());
app.use(methodOverride('_method', {
  methods: ['POST', 'GET']
}));


//ROUTES
app.get('/', postControllers.getAllPosts);
app.get("/post/:id", postControllers.getPost);
app.post('/post', postControllers.createPost);
app.put('/post/:id', postControllers.updatePost);
app.delete('/post/:id', postControllers.deletePost);

app.get("/about", pageController.getAboutPage);
app.get("/add_post", pageController.getAddPage);
app.get('/posts/edit/:id', pageController.getEditPage);


const port = 3000;
app.listen(port, ()=>{
    console.log(`Server ${port} portunda başlatıldı.`)
})

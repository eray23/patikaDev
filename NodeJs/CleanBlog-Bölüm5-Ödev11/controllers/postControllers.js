const Photo = require('../models/Photo');


exports.getAllPosts = async (req, res) => {
    const posts = await Photo.find({});
    res.render('index', {
        posts
    })
}
exports.getPost = async (req, res) => {
    const post = await Photo.findById(req.params.id);
    res.render('post', {
        post
    });
}
exports.createPost = async (req, res) => {
    await Photo.create(req.body);
    res.redirect('/');
}
exports.updatePost = async (req, res) => {
    const post = await Photo.findOne({ _id: req.params.id });
    post.title = req.body.title;
    post.description = req.body.description;
    post.save();

    res.redirect(`/post/${req.params.id}`);
}
exports.deletePost = async (req, res) => {
    await Photo.findByIdAndRemove(req.params.id);
    res.redirect('/');
}
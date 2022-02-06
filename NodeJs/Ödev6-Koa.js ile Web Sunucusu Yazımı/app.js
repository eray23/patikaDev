const koa = require("koa");
const path = require("path");
const koaRouter = require("koa-router");


const app = new koa();
const router = new koaRouter();


router.get("index", "/", ctx => {
    ctx.body = "<h1>Index sayfasına hoşgeldiniz</h1>";
});

router.get("about", "/about", ctx => {
    ctx.body = "<h1>About sayfasına hoşgeldiniz</h1>";
});

router.get("contact", "/contact", ctx => {
    ctx.body = "<h1>Contact sayfasına hoşgeldiniz</h1>";
});


app.use(router.routes()).use(router.allowedMethods());

const PORT = 3000;
app.listen(PORT, () => console.log(`running on port ${PORT}`));
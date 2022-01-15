const posts = [
    {title : "İklim Değişiklikleri", author : "Eray"},
    {title : "Piyasa Hareketleri", author : "Ahmet"},
    {title : "Küresel Isınma", author : "Mehmet"}
]

const listPosts = () => {
    posts.map((post) =>{
        console.log(post.title);
    });
};
const addPost = (newPost) =>{
    const promise1 = new Promise((resolve, reject)=>{
        posts.push(newPost);
        resolve(posts);
        //reject('Bir Hata Oluştu');
    });
    return promise1;
};

async function showPosts(){
    try{
        await addPost({title :"Kodlamaya başlangıç", author:"Ali"});
        listPosts();
    }catch(err){
        console.log(err);
    }
}
showPosts();
const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];
const buttonContainer = document.querySelector(".btn-container");
const menuContainer = document.querySelector(".section-center");


function createButtons(categoryName){
  let button = `
  <button type="button" class="btn btn-dark" style="width: 100px; margin: 10px;" id="${categoryName}">${categoryName}</button>
  `;
  buttonContainer.innerHTML += button;
}
let group = 'category';
let allCategory = menu.map(x =>{
  return x.category;
})
let categories = allCategory.reduce((acc,x) => {
  if(!acc.includes(x)){
    acc.push(x);
  }
  
  return acc;
}, [])

createButtons("All");
console.log(allCategory);
console.log(categories);

for(let i = 0; i<categories.length;i++){
  createButtons(categories[i]);
}
const btnAll = document.getElementById('All').addEventListener("click",showAllFoods);
const btnKorea = document.querySelector('#Korea').addEventListener("click", showKoreanFoods);
const btnChina = document.querySelector('#China').addEventListener("click",showChineseFoods);
const btnJapan = document.querySelector('#Japan').addEventListener("click", showJapaneseFoods);
const first = document.onLoad(showAllFoods());

function showAllFoods(){
  let showMenu = "";
  menu.map((x) => {
    showMenu += createMenu(x);
  })
  
  menuContainer.innerHTML = showMenu;
  
} 
function showChineseFoods(){
 let showMenu = " ";
  menu.map((x) => {
    if(x.category === 'China'){
      showMenu += createMenu(x);
    } 
    menuContainer.innerHTML = showMenu;
  })
}
function showJapaneseFoods(){
  let showMenu = " ";
  menu.map((x) => {
    if(x.category === 'Japan'){
      showMenu += createMenu(x);
    }
    menuContainer.innerHTML = showMenu;
  })
  

}
function showKoreanFoods(){
  let showMenu = " ";
  menu.map((x) => {
    if(x.category === 'Korea'){
      showMenu += createMenu(x);
    }
    menuContainer.innerHTML = showMenu;
  })
}

function createMenu(object){
  let foodCard = " ";
  foodCard = `
  <div class="card" style="width: 18rem; margin: 10px;">
      <img src="${object.img}" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">${object.title}</h5>
        <p class="card-text">${object.desc}</p>
      </div>
      <ul class="list-group list-group-flush">
        <li class="list-group-item">${object.price}</li>
      </ul>
    </div>
  
  
  
  `;
  return foodCard;
}







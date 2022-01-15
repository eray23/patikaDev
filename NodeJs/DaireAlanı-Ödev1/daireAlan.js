const arguments = process.argv.slice(2);

function daireAlan(yaricap){

    let alan = Math.PI * yaricap * yaricap;
    
    console.log("Yarıçapı "+yaricap+" olan dairenin alanı : "+ alan);
}
daireAlan(arguments[0]*1);

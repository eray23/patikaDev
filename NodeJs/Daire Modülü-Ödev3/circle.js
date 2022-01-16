function circleArea(r){

    let daireAlan = Math.PI*r*r;
    console.log(daireAlan);
}


function circleCircumference(r){
    let daireCevre = 2*Math.PI*r;
    console.log(daireCevre);
}



module.exports ={
    circleArea,
    circleCircumference
}
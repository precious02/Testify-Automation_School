const side1 = 7
const side2 = 12
const side3 = 7

if(side1===side2 && side2===side3 && side1===side3){
    console.log('Equilateral triangle')
}
else if(side1===side2 || side2===side3 || side1===side3){
    console.log('Isosceles Triangle')
}       
else{
    console.log('Scalene Triangle')
}   

//Write a Javascript program that prints the name of the triangle based on the length of the sides in relation to one another.
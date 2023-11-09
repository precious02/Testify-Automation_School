const LengthInMeters = 5.2;

function lengthConverter (LengthInMeters){
    let lengthInCentiMetres = LengthInMeters * 100
    return lengthInCentiMetres;
}

console.log("Length in Centimetre is "+lengthConverter(LengthInMeters))

//length converter function
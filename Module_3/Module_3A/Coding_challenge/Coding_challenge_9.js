//Return number of vowels in a string.

const str = 'Family Union'
const words = str.split("")

function getVowelCount() {
    //Use the match method to find all matches of vowels in the string
    //Use gi to match case insensitively
    return words.filter(word => word.match(/[aeiou]/gi)).length
}

console.log(getVowelCount())
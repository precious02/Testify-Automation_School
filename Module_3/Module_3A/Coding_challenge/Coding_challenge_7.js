//Sort an array of numbers in descending order
const scores = [4, 2, 10, 63, 3.5, 5]

scores.sort(function (a, b) {
    if (a > b) {
        return -1
    }
    if (b > a) {
        return 1
    }
    return 0
})
console.log(scores)
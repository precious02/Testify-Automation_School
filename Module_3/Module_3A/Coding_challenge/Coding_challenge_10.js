//Create a function that filters out negative numbers

let mixedNumArray = [-10,-2, 3.2, -8, 12, 0, 5]

  filPositive = mixedNumArray.filter(n => n > 0)

console.log(filPositive + ' are the positive numbers remaining in the array after filtering out negative numbers')
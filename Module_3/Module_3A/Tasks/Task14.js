//Add a toggleReadingStatus method to your books objects. 
const books = {
    title : 'Rich Dad Poor Dad',
    description : 'Financial knowledge',
    numberOfPages : 500,
    author : 'Robert Kiyosaki',
    reading : true,
    toggleReadingStatus: function(){
        if (books.reading === true){
            books.reading = false
        }else{
            books.reading = true
        }
    }
}

books.toggleReadingStatus()
console.log(books.reading)
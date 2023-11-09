// Use a for-loop to loop through the books array and log all books where the reading status is true to the console

    const books = [
        {
            title : 'Purple Hibiscus',
            description : 'Family',
            numberOfPages : 450,
            author : 'Chimamanda Adichie',
            reading : true
        },
        {
            title : 'Smart Money Woman',
            description : 'Finance',
            numberOfPages : 250,
            author : 'Arese Ugwu',
            reading : false
        },
        {
            title : 'Dating Intelligently',
            description : 'Godly marriage',
            numberOfPages : 300,
            author : 'Laju Iren',
            reading : true
        }
    ];


for (let i = 0; i < books.length; i++){
    if(books[i].reading === true){
        console.log(books[i].title)
        console.log(books[i].description)
        console.log(books[i].numberOfPages)
        console.log(books[i].author)
        console.log("++++++")

    }
}


var cache = {}

var key = `job-${4}`

if (! (key in cache)){
    cache[key] = 1
}

if (! (key in cache)){
    cache[key] = 2
}

console.log(cache[key]) // prints 1

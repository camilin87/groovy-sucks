def cache = [:]

def key = "job-${4}"

if (!cache.containsKey(key)){
    cache[key] = 1
}

if (!cache.containsKey(key)){
    cache[key] = 2
}

println(cache[key]) // prints 2, WTF!

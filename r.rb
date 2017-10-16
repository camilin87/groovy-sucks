cache = {}
key = "job-#{4}"

if not cache.has_key?(key)
    cache[key] = 1
end

if not cache.has_key?(key)
    cache[key] = 2
end

puts cache[key] # prints 1
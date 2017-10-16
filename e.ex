cache = %{}

key = "job-#{4}"

cache = case cache |> Map.has_key?(key) do
  false -> cache |> Map.put(key, 1)
  _ -> cache
end

cache = case cache |> Map.has_key?(key) do
  false -> cache |> Map.put(key, 2)
  _ -> cache
end

IO.puts cache[key] # prints 1

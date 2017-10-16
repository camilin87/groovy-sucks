object s{
    def main(args: Array[String]): Unit = {
        val commitCache = collection.mutable.Map.empty[String, Int]

        val key = s"job-${4}"

        if (!commitCache.contains(key)){
            commitCache.put(key, 1)
        }

        if (!commitCache.contains(key)){
            commitCache.put(key, 2)
        }

        println(commitCache.get(key)) // prints 1
    }
}

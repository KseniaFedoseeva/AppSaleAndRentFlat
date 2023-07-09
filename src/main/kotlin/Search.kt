interface Search<T> {
    fun searchFlat(mutableMap: MutableMap<Int, T>) : Set<T> {
        return setOf()
    }
}
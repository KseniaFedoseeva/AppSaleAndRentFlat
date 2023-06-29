class RequestAppartForRent(): Search<AppartForRent> {

    override fun searchFlat(mutableMap: MutableMap<Int, AppartForRent>): Set<AppartForRent> {
        println("Введите нужный район города")
        var variableDistrict: String = readLine()!!.toString()
        val listOfFlats = mutableMap.values.filter { it.district == variableDistrict}.sortedBy { it.price }
        println(listOfFlats)
        return listOfFlats.toSet()
    }
}
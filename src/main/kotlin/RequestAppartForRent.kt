class RequestAppartForRent(): Search<Building> {

    override fun searchFlat(mutableMap: MutableMap<Int, Building>): Set<Building> {
        println("Введите нужный район города")
        var variableDistrict: String = readLine()!!.toString()
        val listOfFlats = mutableMap.values.filter { it.getDistrict() == variableDistrict}.sortedBy { it.getPrice() }
        println(listOfFlats)
        return listOfFlats.toSet()
    }
}
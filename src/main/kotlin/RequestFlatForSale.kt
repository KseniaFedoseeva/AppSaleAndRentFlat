open class RequestFlatForSale(): Search<FlatForSale> {

    override fun searchFlat(mutableMap: MutableMap<Int, FlatForSale>): Set<FlatForSale> {
      println("Введите максимальную цену квартиры")
      var variablePrice:Int = readLine()!!.toInt()
      val listOfFlats = mutableMap.values.filter { it.price <= variablePrice}
      println(listOfFlats)
      return listOfFlats.toSet()
    }
}
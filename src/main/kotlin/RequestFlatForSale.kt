open class RequestFlatForSale(): Search<Building> {

    override fun searchFlat(mutableMap: MutableMap<Int, Building>): Set<Building> {
      println("Введите максимальную цену квартиры")
      var variablePrice:Int = readLine()!!.toInt()
      val listOfFlats = mutableMap.values.filter { it.getPrice() <= variablePrice}
      println(listOfFlats)
      return listOfFlats.toSet()
    }
}
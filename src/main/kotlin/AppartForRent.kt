class AppartForRent (var area: Int, private var price: Int, var foto: Boolean, private var district: String): ThingForIncome(), Building {

    override fun toString()= "Квартира площадью $area в районе $district по цене $price"
    override fun getPrice(): Int {
        return price
    }

    override fun getDistrict(): String {
        return district
    }
}
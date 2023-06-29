fun main(args: Array<String>) {
    var mapOfFlatForSale = mutableMapOf<Int, FlatForSale>()
    mapOfFlatForSale[1] = FlatForSale(50, 4500, true, "Свердловский")
    mapOfFlatForSale[2] = FlatForSale(58, 5500, true, "Комсомольский")
    mapOfFlatForSale[3] = FlatForSale(59, 6500, true, "Индустриальный")
    mapOfFlatForSale[4] = FlatForSale(53, 3900, true, "Ленинский")
    mapOfFlatForSale[5] = FlatForSale(51, 8600, true, "Свердловский")
    mapOfFlatForSale[6] = FlatForSale(52, 4850, true, "Андреевский")

   // RequestFlatForSale().searchFlat(mapOfFlatForSale)

    var mapOfAppartForRent = mutableMapOf<Int, AppartForRent>()
    mapOfAppartForRent[1] = AppartForRent(59, 50, true, "Ивановский")
    mapOfAppartForRent[2] = AppartForRent(53, 40, true, "Усольский")
    mapOfAppartForRent[3] = AppartForRent(58, 50, true, "Приморский")
    mapOfAppartForRent[4] = AppartForRent(49, 50, true, "Красноармейский")
    mapOfAppartForRent[5] = AppartForRent(48, 60, true, "Центральный")
    mapOfAppartForRent[6] = AppartForRent(99, 45, true, "Ивановский")
    mapOfAppartForRent[7] = AppartForRent(29, 26, true, "Красноармейский")

    RequestAppartForRent().searchFlat(mapOfAppartForRent)

}
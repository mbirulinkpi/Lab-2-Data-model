import java.time.LocalDate

data class Drugs(
    val name: String,
    val form: String,
    val manufacturer: String,
    val productionDate: LocalDate,
    val shelfLife: Int,
    val price: Double,
    val requiresPrescription: Boolean
) : Comparable<Drugs> {
    override fun compareTo(other: Drugs): Int {
        val cmp = name.compareTo(other.name)
        return if (cmp != 0) cmp else price.compareTo(other.price)
    }
}
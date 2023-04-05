import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val hospitalContainer = context.getBean(Container::class.java) as HospitalContainer

    val drugs = listOf(
        Drugs("Ibuprofen", "Capsule", "Advil", LocalDate.of(2023, 7, 1), 4, 3.99, true),
        Drugs("Paracetamol", "Tablet", "Tylenol", LocalDate.of(2024, 12, 31), 1, 0.99, false),
        Drugs("Amoxicillin", "Capsule", "Amoxil", LocalDate.of(2025, 6, 15), 10, 5.99, true)
    )

    hospitalContainer.add(
        Hospital(
            "Mount Sinai Hospital",
            "1 Gustave L. Levy Pl.",
            "Cardiology",
            LocalDate.of(1985, 6, 1),
            15,
            1000,
            true,
            drugs
        ),
    )
    hospitalContainer.add(
        Hospital(
            "Johns Hopkins Hospital",
            "1800 Orleans St.",
            "Oncology",
            LocalDate.of(1900, 5, 28),
            20,
            1500,
            true,
            drugs
        ),
    )
    hospitalContainer.add(
        Hospital(
            "Massachusetts General Hospital",
            "55 Fruit St.",
            "Neurology",
            LocalDate.of(1811, 9, 1),
            25,
            2000,
            true,
            drugs
        )
    )
}
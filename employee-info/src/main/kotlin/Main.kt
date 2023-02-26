fun main(args: Array<String>) {
    val person1 = contacts(1,
        "Sam",
        "Davenport",
        "sldavenport@gmail.com",
        "815-690-3247",
        "800-312-7000",
        "815-690-3247")
    val person2 = contacts(2,
        "Katie",
        "Callahan",
        "katiecal1118@yahoo.com",
        "630-363-1572",
        "888-456-8800",
        "630-363-1572")
    val person3 = contacts(3,
        "Kelsey",
        "Stealy",
        "klsydaven@gmail.com",
        "815-690-1782",
        "800-555-3442",
        "815-690-1782")

    person1.printAll()
    println("\n")
    person2.printAll()
    println("\n")
    person3.printAll()
}
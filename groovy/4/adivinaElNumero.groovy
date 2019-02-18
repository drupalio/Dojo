Random random = new Random()
def oculto = random.nextInt(20)

while (true) {
    print "Digita un numero: "
    def numero = System.in.newReader().readLine() as Integer
    if (numero < oculto) {
        println "tu numero es muy pequeño"
    } else if (numero > oculto) {
        println "el numero es mayor"
    } else {
        println "adivinaste prro!"
        break
    }
}

println "cortalas"

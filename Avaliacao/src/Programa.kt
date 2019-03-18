fun main(args: Array<String>) {

    val horaEscavadeira = Equipamentos(
        "escavadeira",
        240.0 * 80
    )
    val horaTrator = Equipamentos(
        "trator",
        150.0 * 70
    )
    val horaGindaste = Equipamentos(
        "guindaste",
        360.0 * 60
    )
    val horaBetoneira = Equipamentos(
        "betoneira",
        200.0 * 90
    )
    val horaMestre = maoDeObra(
        "Mestre de Obra",
        120.0 * 300
    )
    val horaPedreiro = maoDeObra(
        "Pedreiro",
        100.0 * 300
    )
    val horaServente = maoDeObra(
        "Servente",
        70.0 * 300
    )
    val consumoAreia = Insumos(
        "areia",
        3.0 * 300
    )
    val consumoPedra = Insumos(
        "pedra",
        12.0 * 200
    )
    val consumoTijolo = Insumos(
        "tijolo",
        0.30 * 5000
    )
    val consumoCal = Insumos(
        "cal",
        10.0 * 150
    )
    val minhaCasa = Obra("minhaCasa")
    minhaCasa.quantidadeHorasTrabalhadas(horaMestre)
    minhaCasa.quantidadeHorasTrabalhadas(horaPedreiro)
    minhaCasa.quantidadeHorasTrabalhadas(horaServente)
    minhaCasa.horasDeEquipamentosUtilizado(horaEscavadeira)
    minhaCasa.horasDeEquipamentosUtilizado(horaBetoneira)
    minhaCasa.horasDeEquipamentosUtilizado(horaGindaste)
    minhaCasa.horasDeEquipamentosUtilizado(horaTrator)
    minhaCasa.quantidadeInsumos(consumoAreia)
    minhaCasa.quantidadeInsumos(consumoCal)
    minhaCasa.quantidadeInsumos(consumoPedra)
    minhaCasa.quantidadeInsumos(consumoTijolo)

    println("Total: ${minhaCasa.quantidadeUtilizadaDeMaoDeObra()}")
    println("Total: ${minhaCasa.horasTrabalhadasDeEquipamentos()}")
    println("Total: ${minhaCasa.quantidadeConsumidaDeInsumos()}")


}
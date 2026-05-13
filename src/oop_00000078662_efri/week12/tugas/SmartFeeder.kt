package oop_00000078662_efri.week12.tugas

fun dispenseKibble(
    requestedGram: Int,
    availableGram: Int,
    isJammed: Boolean
): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }

    if (isJammed) {
        throw DispenserJamException()
    }

    return availableGram
}
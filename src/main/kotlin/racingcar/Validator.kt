package racingcar

const val NAME_SEPARATOR = ","
const val MAX_NAME_LENGTH = 5
object Validator {
    fun isEmptyInput(input: String): Boolean {
        return input.isEmpty()
    }

    fun validateInput(input: String) {
        if (isEmptyInput(input)) {
            throw IllegalArgumentException("잘못 입력했어요.")
        }
    }

    fun isInvalidCarNameLength(carName: String): Boolean {
        return carName.length > MAX_NAME_LENGTH
    }

    fun validateCarName(carName: String) {
        if (isEmptyInput(carName)) {
            throw IllegalArgumentException("자동차 이름을 잘못 입력했어요.")
        }

        if (isInvalidCarNameLength(carName)) {
            throw IllegalArgumentException("자동차 이름은 ${MAX_NAME_LENGTH}자 이하로 입력해주세요.")
        }
    }
}